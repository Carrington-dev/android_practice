package com.stemgon.scoomy.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.stemgon.scoomy.R;
import com.stemgon.scoomy.adapters.DataRVAdapter;
import com.stemgon.scoomy.dbhelpers.ContactDbHelper;
import com.stemgon.scoomy.interfaces.RecyclerviewOnItemClickListener;
import com.stemgon.scoomy.models.Book;

import java.util.ArrayList;
import java.util.Collections;

public class BooksActivity extends AppCompatActivity implements RecyclerviewOnItemClickListener {
    RecyclerView recyclerView;
    ContactDbHelper mDbHelper;
    ArrayList<Book> books = new ArrayList<Book>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);


        recyclerView = findViewById(R.id.books_holder);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mDbHelper = new ContactDbHelper(getApplicationContext());

        ArrayList<Book> booksList = new ArrayList<Book>();
        books = new ArrayList<Book>();

        for (int i = 0; i < 0; i++) {
            books.add(new Book("A level Mathematics", "Carrington Muleya", i + 1, 23 + i));
        }

        this.readAllData();

        Collections.reverse(books);

        DataRVAdapter mAdapter = new DataRVAdapter(this, books);

        recyclerView.setAdapter(mAdapter);
//        recyclerView.setOnClickListener((View.OnClickListener) this);


    }

    void readAllData() {
        Cursor cursor = mDbHelper.readFromDatabase();
        if (cursor.getCount() == 0) {
            Toast.makeText(BooksActivity.this, "No books in the library", Toast.LENGTH_SHORT).show();

        } else {

            while (cursor.moveToNext()){

                books.add(new Book(
                                cursor.getString(1),
                                cursor.getString(2),
                                Integer.parseInt(cursor.getString(0)),
                                Integer.parseInt(cursor.getString(3))
                        )
                );


            }

            Toast.makeText(BooksActivity.this,  books.size() + " books found  in the library", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
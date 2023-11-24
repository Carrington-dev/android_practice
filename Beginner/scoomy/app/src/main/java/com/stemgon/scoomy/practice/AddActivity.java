package com.stemgon.scoomy.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.stemgon.scoomy.R;
import com.stemgon.scoomy.dbhelpers.ContactDbHelper;
import com.stemgon.scoomy.models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AddActivity extends AppCompatActivity {
    EditText authorEditText, titleEditText, pagesEditText;
    Button okButton;
    ContactDbHelper mDbHelper;
    ArrayList<Book> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        authorEditText = findViewById(R.id.author_ed);
        titleEditText = findViewById(R.id.title_ed);
        pagesEditText = findViewById(R.id.pages_ed);


        okButton = findViewById(R.id.okButton);

        mDbHelper = new ContactDbHelper(getApplicationContext());

        okButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String author =  authorEditText.getText().toString().trim(),
                       title = titleEditText.getText().toString().trim();

                int pages =  Integer.parseInt(pagesEditText.getText().toString());



                mDbHelper.addBook( title, author, 89);
                Intent intent = new Intent(AddActivity.this, BooksActivity.class);
                startActivity(intent);


                Toast.makeText(AddActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public <T extends Object> void checkType(T object) {
        if (object instanceof Integer)
            System.out.println("Integer ");
        else if(object instanceof Double)
            System.out.println("Double ");
        else if(object instanceof Float)
            System.out.println("Float : ");
        else if(object instanceof List)
            System.out.println("List! ");
        else if(object instanceof Set)
            System.out.println("Set! ");
    }
}
package com.stemgon.scoomy.dbhelpers;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.stemgon.scoomy.practice.BooksActivity;

public class ContactDbHelper extends SQLiteOpenHelper {
    private Context context;
    private static final String DATABASE_NAME = "BookLibrary.db";
    private static final int DATABASE_VERSION = 21;


    private static final String TABLE_NAME = "my_library";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_TITLE = "title";
    private static final String COLUMN_AUTHOR = "author";
    private static final String COLUMN_PAGES = "pages";



    public ContactDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /*
        String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME

                + " ( " + COLUMN_ID  + " INTERGER PRIMARY KEY AUTOINCREMENT, "
                + " " + COLUMN_TITLE  + " TEXT, "
                + " " + COLUMN_AUTHOR  + " TEXT, "
                + " " + COLUMN_PAGES  + " INTERGER );";

         */
        String query  = "CREATE TABLE IF NOT EXISTS my_library ( _id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, author TEXT,  pages INTERGER );";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }


    public void addBook(String title, String author, int pages){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_TITLE, title);
        cv.put(COLUMN_PAGES, pages);
        cv.put(COLUMN_AUTHOR, author);

        long result = db.insert(TABLE_NAME, null, cv);



        if (result == -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Added succesfully!", Toast.LENGTH_SHORT).show();

        }

    }

    public Cursor readFromDatabase(){
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = null;

        if(db != null)
        {
            cursor = db.rawQuery(query, null);
        }

        return cursor;
    }
}

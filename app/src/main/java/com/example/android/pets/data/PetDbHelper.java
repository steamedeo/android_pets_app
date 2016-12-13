package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by stefano on 12/12/2016.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "shelter.db";
    public static final int DATABASE_VERSION = 1;

    //database creation statement
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + PetContract.PetEntry.TABLE_NAME + "(" +
                    PetContract.PetEntry._ID + " INTEGER PRIMARY KEY, " +
                    PetContract.PetEntry.COLUMN_PET_NAME + " TEXT, " +
                    PetContract.PetEntry.COLUMN_PET_BREED + " TEXT, " +
                    PetContract.PetEntry.COLUMN_PET_GENDER + " INTEGER, " +
                    PetContract.PetEntry.COLUMN_PET_WEIGHT + " INTEGER " + ")";


    //constructor
    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}


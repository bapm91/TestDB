package com.example.user.testdb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "database.db";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_TABLE = "ticket";
    public static final String _ID = "id_title_name";
    public static final String TITLE_COLUMN = "title";
    public static final String BODY_COLUMN = "body";
    public static final String CREATE_DATE_COLUMN = "create_date";
    public static final String START_DATE_COLUMN = "start_date";
    public static final String DEADLINE_COLUMN = "deadline";
    public static final String LIKES_COLUMN = "likes";

    private static final String DATABASE_CREATE_SCRIPT = "create table "
            + DATABASE_TABLE + " (" + _ID
            + " integer primary key autoincrement, " + TITLE_COLUMN
            + " text not null, " + BODY_COLUMN + " text not null, " + CREATE_DATE_COLUMN
            + " text not null, " + START_DATE_COLUMN + " text not null, "
            + DEADLINE_COLUMN + " text not null, " + LIKES_COLUMN + " text not null);";

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE_SCRIPT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

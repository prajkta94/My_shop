package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConnectionHelper  {

    public static final String KEY_STUID = "stuid";
    public static final String KEY_Name = "Name";
    public static final String KEY_Address = "Address";
    public static final String KEY_MobileNo = "Mobile_No";
//    public static final String KEY_MARKS1 = "marks_one";
//    public static final String KEY_MARKS2 = "marks_two";
//    public static final String KEY_MARKS3 = "marks_three";

    private static final String DATABASE_NAME = "Student.db";
    private static final String DATABASE_MARKSTABLE = "Student";
    private static final int DATABASE_VERSION = 1;

//    private DbHelper ourHelper;

    private SQLiteDatabase ourDatabase;

//    private static class DbHelper extends SQLiteOpenHelper {
//
//        public DbHelper(Context context) {
//            super(context, DATABASE_NAME, null, DATABASE_VERSION);
//            // TODO Auto-generated constructor stub
//        }
//
//        @Override
//        public void onCreate(SQLiteDatabase db) {
//            // TODO Auto-generated method stub
//            db.execSQL(" CREATE TABLE " + DATABASE_MARKSTABLE + " (" +
//                    KEY_STUID + " TEXT PRIMARY KEY, " +
//                    KEY_SUB1 + " TEXT NOT NULL, " +
//                    KEY_SUB2 + " TEXT NOT NULL, " +
//                    KEY_SUB3 + " TEXT NOT NULL, " +
//                    KEY_MARKS1 + " INTEGER NOT NULL, " +
//                    KEY_MARKS2 + " INTEGER NOT NULL, " +
//                    KEY_MARKS3 + " INTEGER NOT NULL);"
//            );
//        }
//
//        @Override
//        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//            // TODO Auto-generated method stub
//
//            db.execSQL("DROP TABLE IF EXISTS " + DATABASE_MARKSTABLE);
//            onCreate(db);
//        }
//
//    }
//
//    public ConnectionHelper(Context c) {
//        ourContext = c;
//    }
//
//    public ConnectionHelper open() throws SQLException {
//        ourHelper = new DbHelper(ourContext);
//        ourDatabase = ourHelper.getWritableDatabase();
//        return this;
//    }
//
//    public void close() {
//        ourHelper.close();
//    }

//    @Override
//    public void onCreate(SQLiteDatabase db) {
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//    }

//    public long createInsert(String stuid, String subject1, String subject2,
//                             String subject3, String marks1, String marks2, String marks3) {
//        // TODO Auto-generated method stub
//        ContentValues cv = new ContentValues();
//        cv.put(KEY_STUID, stuid);
//        cv.put(KEY_SUB1, subject1);
//        cv.put(KEY_SUB2, subject2);
//        cv.put(KEY_SUB3, subject3);
//        cv.put(KEY_MARKS1, marks1);
//        cv.put(KEY_MARKS2, marks2);
//        cv.put(KEY_MARKS3, marks3);
//        return ourDatabase.insert(DATABASE_MARKSTABLE, null, cv);
//    }
}
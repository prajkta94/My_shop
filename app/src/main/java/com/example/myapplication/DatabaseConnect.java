package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseConnect extends SQLiteOpenHelper {
    public static final String KEY_STUID = "stuid";
    public static final String KEY_Name = "Name";
    public static final String KEY_Address = "Address";
    public static final String KEY_MobileNo = "Mobile_No";
    private static final String DATABASE_NAME = "Student.db";
    private static final String DATABASE_MARKSTABLE = "Student";
    private static final int DATABASE_VERSION = 1;

    public DatabaseConnect(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(" CREATE TABLE " + DATABASE_MARKSTABLE + " (" +
                    KEY_STUID + " TEXT PRIMARY KEY, " +
                    KEY_Name+ " TEXT NOT NULL, " +
                    KEY_Address + " TEXT NOT NULL, " +
                    KEY_MobileNo + " TEXT NOT NULL );"
//                    KEY_MARKS1+ " INTEGER NOT NULL, " +
//                    KEY_MARKS2 + " INTEGER NOT NULL, " +
//                    KEY_MARKS3 + " INTEGER NOT NULL);"
          );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_MARKSTABLE);
            onCreate(db);

    }
    public String createInsert(String stuid, String Name, String Address,
                               int MobileNo) {

        SQLiteDatabase db=this.getWritableDatabase();
        // TODO Auto-generated method stub
        ContentValues cv = new ContentValues();
//        cv.put(KEY_STUID, stuid);
        cv.put(KEY_Name, Name);
        cv.put(KEY_Address, Address);
        cv.put(KEY_MobileNo, MobileNo);
long rs=db.insert(DATABASE_MARKSTABLE,null,cv);

if (rs==1) {
    return "Failed";
}
else {
    return "Sucessfully";
}
    }
}

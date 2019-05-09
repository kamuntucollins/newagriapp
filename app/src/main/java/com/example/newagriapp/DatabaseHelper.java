package com.example.newagriapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper( Context context) {
        super(context, "Login.db",null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("Create table Farmerdetails(username text primary key,email text,password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("Drop table if exists Farmerdetails");
    }
    //inserting the data into ur dATABASE
    public  boolean insert(String username,String email,String password){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentvalues=new ContentValues();
        contentvalues.put("username",username);
        contentvalues.put("email",email);
        contentvalues.put("password",password);
        long ins=db.insert("Farmerdetails",null,contentvalues);
        if(ins==-1) return false;
        else return true;
    }
    //checking if undername is existing
    public  Boolean chkusername(String username){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from Farmerdetails where username=?",new String[]{username});
        if(cursor.getCount()>0) return  false;
         else return true;

    }
}

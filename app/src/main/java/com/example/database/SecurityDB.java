package com.example.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SecurityDB extends SQLiteOpenHelper {

    //用户表
    public final static String TABLE_NAME_USERS="users";
    public final static String USER_ID_USERS="_id";
    public final static String USERNAME_USERS="username";
    public final static String PASSWORD_USERS="password";
    //数据表
    public final static String TABLE_NAME_RECORD = "record";
    public final static String RECORD_ID = "_id";
    public final static String RECORD_TITLE = "title_name";
    public final static String RECORD_BODY = "text_body";
    public final static String RECORD_TIME = "create_time";
    public final static String NOTICE_TIME ="notice_time";
    public final static String RECORD_TYPE="record_type";
    public final static String RECORD_USER_ID="record_user_id";
  //查询表
    public final static String TABLE_NAME_SEARCH ="table_search";
    public final static String SEARCH_ID = "_id";
    public final static String SEARCH_TITLE = "title_name";
    public final static String SEARCH_BODY = "search_body";

    String userTable = "CREATE TABLE "+TABLE_NAME_USERS+" ("+USER_ID_USERS+" INTEGER PRIMARY KEY AUTOINCREMENT," +
            USERNAME_USERS+" VARCHAR(30)," +
            PASSWORD_USERS+" TEXT "+ ")";

    String createRecordTable = "CREATE TABLE "+TABLE_NAME_RECORD+" ("+RECORD_ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
            RECORD_TITLE+" VARCHAR(30)," +
            RECORD_USER_ID+" INTEGER,"+
            RECORD_BODY+" TEXT,"+
            RECORD_TIME+" DATETIME NOT NULL, " +
            NOTICE_TIME+" DATETIME,"+
            RECORD_TYPE+" INTEGER NOT NULL"+")";

    String createSearchTable ="CREATE TABLE "+TABLE_NAME_SEARCH+" ("+SEARCH_ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
            SEARCH_TITLE+" VARCHAR(30)" +
           // SEARCH_BODY+"TEXT"+
            ")";
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createRecordTable);
        db.execSQL(createSearchTable);
        db.execSQL(userTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public SecurityDB(Context context){ super(context, "test9.db", null, 2);}
}

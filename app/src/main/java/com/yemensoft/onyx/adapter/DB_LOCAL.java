package com.yemensoft.onyx.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;


@SuppressLint("SimpleDateFormat")
public class DB_LOCAL extends SQLiteOpenHelper {

    public static final String DB_NAME = "DB.db";
    public static final String ACCOUNT_USERS = "ACCOUNT_USERS";

    public Context mContext;

    public DB_LOCAL(Context context, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, factory, version);
        mContext = context;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + ACCOUNT_USERS + " " +
                "(USER_IDD INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "UserShownName VARCHAR," +
                "GOUserID VARCHAR," +
                "UserEmail VARCHAR, " +
                "UserType VARCHAR, " +
                "Mobile VARCHAR ," +
                "MobileWhatsapp VARCHAR  " +
                ",UserImage VARCHAR ," +
                "FireBaseUser_id VARCHAR ," +
                "UserFullName VARCHAR " +
                ",UserAddress VARCHAR ," +
                "UserGender VARCHAR ," +
                "PrithDate VARCHAR ," +
                "PrithPlace VARCHAR ," +
                "DocumentType VARCHAR," +
                "DocumentNo VARCHAR," +
                "IsOnline VARCHAR," +
                "User_id VARCHAR" +
                ",UserBusiness VARCHAR," +
                "UserBusinessType VARCHAR," +
                "GpsLat VARCHAR," +
                "GpsLong VARCHAR," +
                "Natialty_id VARCHAR " +
                ",ReleaseDate VARCHAR," +
                "ExpireDate VARCHAR," +
                "DocumentImage VARCHAR," +
                "ReleasePlace VARCHAR," +
                "UserClosestPersonName VARCHAR" +
                ",UserClosestPersonMobile VARCHAR," +
                "UserClosestPersonRelated VARCHAR," +
                "UserFacebook VARCHAR," +
                "UserTwitter VARCHAR" +
                ",UserInstgram VARCHAR," +
                "UserFax VARCHAR," +
                "JobId VARCHAR," +
                "UserBox VARCHAR," +
                "DocumentImageBack)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ACCOUNT_USERS + " ");

        onCreate(sqLiteDatabase);
    }

    public Cursor get_data() {
        SQLiteDatabase database = getReadableDatabase();
        String sql = "SELECT * FROM " + DB_LOCAL.ACCOUNT_USERS + " LIMIT 1";
        return database.rawQuery(sql, null);
    }

//    public void INSERT_ACCOUNT_USERS(Profile.Data profile) {
//
//
//        SQLiteDatabase database = getWritableDatabase();
//        String sql = "INSERT INTO " + ACCOUNT_USERS + " VALUES(null, ?, ? ,?, ?, ?, ?, ?, ?,?, ? , ?, ?, ?, ?, ?,?,?,?, ?, ? , ?, ?, ?, ?, ?,?, ? , ?, ?, ?, ?, ?,?,?,?,?)";
//        SQLiteStatement sqLiteStatement = database.compileStatement(sql);
//        sqLiteStatement.clearBindings();
//        sqLiteStatement.bindString(1, profile.UserShownName + "");
//        sqLiteStatement.bindString(2, profile.GOUserID + "");
//        sqLiteStatement.bindString(3, profile.UserEmail + "");
//        sqLiteStatement.bindString(4, profile.UserType + "");
//        sqLiteStatement.bindString(5, profile.Mobile + "");
//        sqLiteStatement.bindString(6, profile.MobileWhatsapp + "");
//        sqLiteStatement.bindString(7, profile.UserImage + "");
//        sqLiteStatement.bindString(8, profile.FireBaseUser_id + "");
//        sqLiteStatement.bindString(9, profile.UserFullName + "");
//        sqLiteStatement.bindString(10, profile.UserAddress + "");
//        sqLiteStatement.bindString(11, profile.UserGender + "");
//        sqLiteStatement.bindString(12, profile.PrithDate + "");
//        sqLiteStatement.bindString(13, profile.PrithPlace + "");
//        sqLiteStatement.bindString(14, profile.DocumentType + "");
//        sqLiteStatement.bindString(15, profile.DocumentNo + "");
//        sqLiteStatement.bindString(16, profile.IsOnline + "");
//        sqLiteStatement.bindLong(17, profile.User_id);
//        sqLiteStatement.bindString(18, profile.UserBusiness + "");
//        sqLiteStatement.bindString(19, profile.UserBusinessType + "");
//        sqLiteStatement.bindString(20, profile.GpsLat + "");
//        sqLiteStatement.bindString(21, profile.GpsLong + "");
//        sqLiteStatement.bindString(22, profile.Natialty_id + "");
//        sqLiteStatement.bindString(23, profile.ReleaseDate + "");
//        sqLiteStatement.bindString(24, profile.ExpireDate + "");
//        sqLiteStatement.bindString(25, profile.DocumentImage + "");
//        sqLiteStatement.bindString(26, profile.ReleasePlace + "");
//        sqLiteStatement.bindString(27, profile.UserClosestPersonName + "");
//        sqLiteStatement.bindString(28, profile.UserClosestPersonMobile + "");
//        sqLiteStatement.bindString(29, profile.UserClosestPersonRelated + "");
//        sqLiteStatement.bindString(30, profile.UserFacebook + "");
//        sqLiteStatement.bindString(31, profile.UserTwitter + "");
//        sqLiteStatement.bindString(32, profile.UserInstgram + "");
//        sqLiteStatement.bindString(33, profile.UserFax + "");
//        sqLiteStatement.bindString(34, profile.UserBox + "");
//        sqLiteStatement.bindString(35, profile.JobId + "");
//        sqLiteStatement.bindString(36, profile.DocumentImageBack + "");
//        sqLiteStatement.executeInsert();
//        database.close();
//
//    }
//
//
//    public void UPDATE_ACCOUNT_USERS(Profile.Data profile) {
//
//        SQLiteDatabase database = getWritableDatabase();
//        String sql = "UPDATE " + ACCOUNT_USERS + " SET UserShownName =?, " +
//                "GOUserID =?,UserEmail =?, UserType =?, Mobile =? ,MobileWhatsapp =?  " +
//                ",UserImage =? ,FireBaseUser_id =? ,UserFullName =? ,UserAddress =? " +
//                ",UserGender =? ,PrithDate =? ,PrithPlace =? ,DocumentType =?,DocumentNo " +
//                "=?,IsOnline =?,User_id =?" +
//                ",UserBusiness=?,UserBusinessType=?,GpsLat=?,GpsLong=?,Natialty_id=?,ReleaseDate=?,ExpireDate=?,DocumentImage=?,ReleasePlace=?,UserClosestPersonName=?" +
//                ",UserClosestPersonMobile=?,UserClosestPersonRelated=?,UserFacebook=?,UserTwitter=?,UserInstgram=?,UserFax=?,UserBox=?,JobId=?,DocumentImageBack=?" +
//                " WHERE GOUserID = ? ";
//        SQLiteStatement sqLiteStatement = database.compileStatement(sql);
//        sqLiteStatement.bindString(1, profile.UserShownName + "");
//        sqLiteStatement.bindString(2, profile.GOUserID + "");
//        sqLiteStatement.bindString(3, profile.UserEmail + "");
//        sqLiteStatement.bindString(4, profile.UserType + "");
//        sqLiteStatement.bindString(5, profile.Mobile + "");
//        sqLiteStatement.bindString(6, profile.MobileWhatsapp + "");
//        sqLiteStatement.bindString(7, profile.UserImage + "");
//        sqLiteStatement.bindString(8, profile.FireBaseUser_id + "");
//        sqLiteStatement.bindString(9, profile.UserFullName + "");
//        sqLiteStatement.bindString(10, profile.UserAddress + "");
//        sqLiteStatement.bindString(11, profile.UserGender + "");
//        sqLiteStatement.bindString(12, profile.PrithDate + "");
//        sqLiteStatement.bindString(13, profile.PrithPlace + "");
//        sqLiteStatement.bindString(14, profile.DocumentType + "");
//        sqLiteStatement.bindString(15, profile.DocumentNo + "");
//        sqLiteStatement.bindString(16, profile.IsOnline + "");
//        sqLiteStatement.bindLong(17, profile.User_id);
//        sqLiteStatement.bindString(18, profile.UserBusiness + "");
//        sqLiteStatement.bindString(19, profile.UserBusinessType + "");
//        sqLiteStatement.bindString(20, profile.GpsLat + "");
//        sqLiteStatement.bindString(21, profile.GpsLong + "");
//        sqLiteStatement.bindString(22, profile.Natialty_id + "");
//        sqLiteStatement.bindString(23, profile.ReleaseDate + "");
//        sqLiteStatement.bindString(24, profile.ExpireDate + "");
//        sqLiteStatement.bindString(25, profile.DocumentImage + "");
//        sqLiteStatement.bindString(26, profile.ReleasePlace + "");
//        sqLiteStatement.bindString(27, profile.UserClosestPersonName + "");
//        sqLiteStatement.bindString(28, profile.UserClosestPersonMobile + "");
//        sqLiteStatement.bindString(29, profile.UserClosestPersonRelated + "");
//        sqLiteStatement.bindString(30, profile.UserFacebook + "");
//        sqLiteStatement.bindString(31, profile.UserTwitter + "");
//        sqLiteStatement.bindString(32, profile.UserInstgram + "");
//        sqLiteStatement.bindString(33, profile.UserFax + "");
//        sqLiteStatement.bindString(34, profile.UserBox + "");
//        sqLiteStatement.bindString(35, profile.JobId + "");
//        sqLiteStatement.bindString(36, profile.DocumentImageBack + "");
//        sqLiteStatement.bindString(37, profile.GOUserID + "");
//
//        sqLiteStatement.execute();
//        database.close();
//    }

    public Cursor DELETE_ACCOUNT_USERS(long User_id) {
        SQLiteDatabase database = getWritableDatabase();
        String sql = "DELETE FROM  " + ACCOUNT_USERS + "  WHERE User_id = ?";
        SQLiteStatement sqLiteStatement = database.compileStatement(sql);
        sqLiteStatement.clearBindings();
        sqLiteStatement.bindLong(1, User_id);
        sqLiteStatement.execute();
        database.close();
        return null;
    }

}

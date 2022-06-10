package com.example.test2dr
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class mysqllite(var content: Context, name:String, ver:Int): SQLiteOpenHelper(content,name,null,ver)
{
    public var createuserlist="create table sixsix("+
            "id integer primary key autoincrement," +
            "username text unique," +  //name数据
            "password text," +      //密码数据
            "email text," +
            "sex integer)"
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(createuserlist)
        Toast.makeText(content,"创建数据库成功",Toast.LENGTH_LONG).show()
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }


}
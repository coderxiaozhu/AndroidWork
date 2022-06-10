package com.example.test2dr

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ac : BaseActivity()

// 朋友界面
class MsgListActivity : BaseActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend1)
        val back:TextView = findViewById(R.id.error_dark_png)

        //把聊天的最后一句话放在页面
        val now_text:TextView = findViewById(R.id.now_text)
        val prefs = getSharedPreferences("data", MODE_PRIVATE)
        now_text.setText(prefs.getString("now_neirong","没有找到内容..."))

        back.setOnClickListener(){

//            ActivityCollector.finishAll()  //  退出所有活动
//            android.os.Process.killProcess(android.os.Process.myPid()) //杀的更彻底
            //退出当前活动
            finish()
        }

        // 强制下线
        val go_out:Button = findViewById(R.id.go_out)
        go_out.setOnClickListener(){
//            val intent = Intent("com.example.broadcastbestpractice.FORCE_OFFLINE")
            val intent = Intent("go")
            sendBroadcast(intent)
        }

        //和朋友聊天
        val chat:TextView = findViewById(R.id.now_text)
        val chatone:TextView = findViewById(R.id.text0)
        val chattwo:ImageView = findViewById(R.id.img0)
        val it2 = Intent(this,ChatActivity::class.java)

        chat.setOnClickListener(){
            startActivity(it2)
            finish()
        }
        chatone.setOnClickListener(){
            startActivity(it2)
            finish()

        }
        chattwo.setOnClickListener(){
            startActivity(it2)
            finish()
        }

        // 跳转到天气列表
        val weather:Button = findViewById(R.id.weather)
        weather.setOnClickListener(){
            var it = Intent(this,QueryWeather::class.java)
            startActivity(it)
        }



    }
}
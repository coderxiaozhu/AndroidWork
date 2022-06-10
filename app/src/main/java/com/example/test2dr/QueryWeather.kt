package com.example.test2dr

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_query_weather.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread


class QueryWeather : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_query_weather)

        sendRequestBtn.setOnClickListener() {
            val result = URL("https://www.yiketianqi.com/free/day?appid=61112942&appsecret=544THBvc&unescape=1").readText()
        }
    }
}
//    public class Request(val url: String) {
//        public fun run() {
//            val forecastJsonStr = URL(url).readText()
//            Log.d(javaClass.simpleName, forecastJsonStr)
//        }
//    }
//}

//    private fun sendRequestWithHttpURLConnerction() {
//
//        var connection: HttpURLConnection? = null
//        thread {
//            val response = StringBuilder()
//            val url = URL("https://www.baidu.com")
//            connection = url.openConnection() as HttpURLConnection
//            connection!!.connectTimeout = 8000
//            connection!!.readTimeout = 8000
//            val input = connection!!.inputStream
//
//            val reader = BufferedReader(InputStreamReader(input))
//            reader.use {
//               reader.forEachLine {
//                   response.append(it)
//
//               }
//            }
//
//        showResponse(response.toString())
//    }catch(e:Exception)
//    {
//        e.printStackTrace()
//    }finally
//    {
//        connection?.disconnect()
//    }
//}
//}
//
//private infix fun Thread.catch(e: Any) {
//
//}
//
//private fun showResponse(response: String) {
//    runOnUiThread {
//        responseText.text = response
//    }
//}
//}
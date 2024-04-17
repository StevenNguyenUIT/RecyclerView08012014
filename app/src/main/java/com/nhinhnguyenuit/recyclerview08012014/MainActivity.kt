package com.nhinhnguyenuit.recyclerview08012014

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val a = TextUtils
//        val b = TextUtils
//        Log.d("steven", a.toString())
//        Log.d("steven", b.toString())
//        var test1 = 11001
//        var test2 = 11190
//        var test3 = 11900
//        var test4 = 999
//        var test5 = 9
//        var result1 = TextUtils.formatDistance(test1)
//        var result2 = TextUtils.formatDistance(test2)
//        var result3 = TextUtils.formatDistance(test3)
//        var result4 = TextUtils.formatDistance(test4)
//        var result5 = TextUtils.formatDistance(test5)
//        Log.d("steven", "1001 rounded to $result1")
//        Log.d("steven", "1190 rounded to $result2")
//        Log.d("steven", "1900 rounded to $result3")
//        Log.d("steven", "999 rounded to $result4")
//        Log.d("steven", "9 rounded to $result5")
    }
}
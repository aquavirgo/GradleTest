package com.example.jguzikowski.gradletest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.example.myfirstlibrary.JokerFinder

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    fun startDownload(v: View){
        var text = findViewById(R.id.text) as TextView
        JokerFinder().getJoke(text, "Janusz", "Duchroter" );

    }
}

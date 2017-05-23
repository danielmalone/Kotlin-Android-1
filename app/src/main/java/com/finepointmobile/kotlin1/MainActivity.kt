package com.finepointmobile.kotlin1

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        val fab = findViewById(R.id.fab) as FloatingActionButton
        setSupportActionBar(toolbar)
        val tv = findViewById(R.id.tv) as TextView
        tv.text = "Welcome to Kotlin!"
        tv.textSize = 32.0F
        val user = User("Daniel", "Malone", "daniel@finepointmobile.com")
        tv.text = user.firstName

        for (i in 0..9) {
            Log.d("MainActivity", "testing " + i)
        }

        fab.setOnClickListener {
            Log.d("MainActivity", "FAB pressed!")
        }
    }
}

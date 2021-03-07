package com.example.codefoxm1waas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun findJobs(view: View) {
        // Do something in response to button
        val intent = Intent(this, FindJobsActivity::class.java)
        startActivity(intent)
    }




    fun testMap(view: View) {
        // Do something in response to button
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }


}
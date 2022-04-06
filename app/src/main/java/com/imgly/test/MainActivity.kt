package com.imgly.test

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_start).setOnClickListener {
            Log.d("yolo", "onCreate: " + SplitInstallManagerFactory.create(applicationContext).installedModules)
            val i = Intent()
            i.setClassName(BuildConfig.APPLICATION_ID, "com.imgly.dynamicfeature.MainActivity")
            startActivity(i)
        }
    }
}
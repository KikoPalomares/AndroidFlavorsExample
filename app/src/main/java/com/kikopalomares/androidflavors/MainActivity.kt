package com.kikopalomares.androidflavors

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

@Suppress("ConstantConditionIf")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (BuildConfig.FLAVOR == "demo") {
            Toast.makeText(this, "Demo!!", Toast.LENGTH_LONG).show()
        }

        if (BuildConfig.FLAVOR == "full") {
            Toast.makeText(this, "Full!!", Toast.LENGTH_LONG).show()
        }

    }
}

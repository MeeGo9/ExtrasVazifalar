package com.appus.extrasvazifalar.firsttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appus.extrasvazifalar.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val extras = intent.extras

        val name = extras?.getString("n")
        val surname = extras?.getString("s")

        textView.text = "$name\n$surname"

    }
}
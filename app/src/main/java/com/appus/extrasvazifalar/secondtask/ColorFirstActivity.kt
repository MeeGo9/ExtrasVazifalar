package com.appus.extrasvazifalar.secondtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appus.extrasvazifalar.R
import kotlinx.android.synthetic.main.activity_color_first.*

class ColorFirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_first)



        colorOpen.setOnClickListener {
            val intent = Intent(this, ColorSecondActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
           val bgcolor = data.getIntExtra("color", 0)
            consbg.setBackgroundColor(bgcolor)
        }
    }
}
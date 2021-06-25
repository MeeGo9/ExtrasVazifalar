package com.appus.extrasvazifalar.secondtask

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appus.extrasvazifalar.R
import kotlinx.android.synthetic.main.activity_color_second.*
import petrov.kristiyan.colorpicker.ColorPicker
import petrov.kristiyan.colorpicker.ColorPicker.OnChooseColorListener


class ColorSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_second)


        openPick.setOnClickListener {
            val colorPicker = ColorPicker(this)
            colorPicker.show()
            colorPicker.setOnChooseColorListener(object : OnChooseColorListener {
                override fun onChooseColor(position: Int, color: Int) {
                    val intent = Intent()
                    intent.putExtra("color", color)
                    setResult(RESULT_OK, intent)
                    finish()
                }

                override fun onCancel() {
                    // put code
                }
            })
        }


    }
}
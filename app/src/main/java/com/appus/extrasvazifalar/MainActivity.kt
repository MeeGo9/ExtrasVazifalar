package com.appus.extrasvazifalar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appus.extrasvazifalar.firsttask.FirstTask
import com.appus.extrasvazifalar.fourthtask.NewsActivity
import com.appus.extrasvazifalar.secondtask.ColorFirstActivity
import com.appus.extrasvazifalar.thirdtask.ThirdTaskActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        ex1.setOnClickListener {
            val intent = Intent(this, FirstTask::class.java)
            startActivity(intent)
        }

        ex2.setOnClickListener {
            val intent = Intent(this, ColorFirstActivity::class.java)
            startActivity(intent)
        }

        ex3.setOnClickListener {
            val intent = Intent(this, ThirdTaskActivity::class.java)
            startActivity(intent)
        }

        ex4.setOnClickListener {
            val intent = Intent(this, NewsActivity::class.java)
            startActivity(intent)
        }
    }
}
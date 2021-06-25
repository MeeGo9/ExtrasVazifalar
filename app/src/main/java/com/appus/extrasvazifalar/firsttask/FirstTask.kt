package com.appus.extrasvazifalar.firsttask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appus.extrasvazifalar.R
import kotlinx.android.synthetic.main.activity_first_task.*

class FirstTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_task)


        button.setOnClickListener {

            val name = name.text.toString()
            val surname = surname.text.toString()

            val bundle = Bundle()
            bundle.putString("n", name)
            bundle.putString("s", surname)

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        }






    }
}
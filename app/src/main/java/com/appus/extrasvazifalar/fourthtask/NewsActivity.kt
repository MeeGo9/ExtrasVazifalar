package com.appus.extrasvazifalar.fourthtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appus.extrasvazifalar.R
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)


        news1.setOnClickListener {
            val text = bigtext1.text.toString()
            val date = date1.text.toString()
            val intent = Intent(this, NewDetailActivity::class.java)
            intent.putExtra("img", R.drawable.newsimage1)
            intent.putExtra("text", text)
            intent.putExtra("date", date)
            startActivity(intent)

        }


        news2.setOnClickListener {
            val text = bigtext2.text.toString()
            val date = date2.text.toString()
            val intent = Intent(this, NewDetailActivity::class.java)
            intent.putExtra("img", R.drawable.newsimgae2)
            intent.putExtra("text", text)
            intent.putExtra("date", date)
            startActivity(intent)

        }

        news3.setOnClickListener {
            val text = bigtext3.text.toString()
            val date = date3.text.toString()
            val intent = Intent(this, NewDetailActivity::class.java)
            intent.putExtra("img", R.drawable.newsimage3)
            intent.putExtra("text", text)
            intent.putExtra("date", date)
            startActivity(intent)
        }


        news4.setOnClickListener {
            val text = bigtext4.text.toString()
            val date = date4.text.toString()
            val intent = Intent(this, NewDetailActivity::class.java)
            intent.putExtra("img", R.drawable.newsimage4)
            intent.putExtra("text", text)
            intent.putExtra("date", date)
            startActivity(intent)

        }

        news5.setOnClickListener {
            val text = bigtext5.text.toString()
            val date = date5.text.toString()
            val intent = Intent(this, NewDetailActivity::class.java)
            intent.putExtra("img", R.drawable.newsimage5)
            intent.putExtra("text", text)
            intent.putExtra("date", date)
            startActivity(intent)

        }

        news6.setOnClickListener {
            val text = bigtext6.text.toString()
            val date = date6.text.toString()
            val intent = Intent(this, NewDetailActivity::class.java)
            intent.putExtra("img", R.drawable.news6)
            intent.putExtra("text", text)
            intent.putExtra("date", date)
            startActivity(intent)

        }

        news7.setOnClickListener {
            val text = bigtext7.text.toString()
            val date = date7.text.toString()
            val intent = Intent(this, NewDetailActivity::class.java)
            intent.putExtra("img", R.drawable.news7)
            intent.putExtra("text", text)
            intent.putExtra("date", date)
            startActivity(intent)

        }
    }
}
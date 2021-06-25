package com.appus.extrasvazifalar.thirdtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appus.extrasvazifalar.R
import com.appus.extrasvazifalar.thirdtask.models.Contact
import kotlinx.android.synthetic.main.activity_third_task.*

class ThirdTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_task)


        sendBtn.setOnClickListener {
            val name = contactname.text.toString()
            val number1 = number1.text.toString()
            val number2 = number2.text.toString()
            val number3 = number3.text.toString()

            var contactNumbers = mutableListOf<String>()
            contactNumbers.add(number1)
            contactNumbers.add(number2)
            contactNumbers.add(number3)

            val contact = Contact(name, contactNumbers)
            var bundle = Bundle()
            bundle.putSerializable("contact", contact)

            val intent = Intent(this, ContactInfoActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        }

    }
}
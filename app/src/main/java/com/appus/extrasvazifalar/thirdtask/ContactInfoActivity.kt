package com.appus.extrasvazifalar.thirdtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appus.extrasvazifalar.R
import com.appus.extrasvazifalar.thirdtask.models.Contact
import kotlinx.android.synthetic.main.activity_contact_info.*

class ContactInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_info)

        val extras = intent.extras

        val contactInfo = extras?.getSerializable("contact") as Contact

        nameCont.text = "${contactInfo.name}"
        numb.text = "${contactInfo.numbers[0]}\n${contactInfo.numbers[1]}\n${contactInfo.numbers[2]}"


    }
}
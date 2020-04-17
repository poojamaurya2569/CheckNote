package com.example.checknote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login.*

class RegestranionDetails : AppCompatActivity() {
lateinit var text:TextView
    var name:String? = null
    var email: String? = null
    var phoneNo:String? = null
    var diliveryAddress:String? = null
    var Password:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regestranion_details)
        text = findViewById(R.id.welcomepage)
       if (intent != null)
       {
        name = intent.getStringExtra("name")
           email = intent.getStringExtra("email")
           phoneNo = intent.getStringExtra("phoneNo")
           diliveryAddress = intent.getStringExtra("dilivery")
           Password = intent.getStringExtra("password")

       }

        text.setText("Congratulations!! You have Registered Sucessfully \n Your Details Are:- \nName:$name\nEmail:$email \n PhoneNO:$phoneNo\nAddress:$diliveryAddress\nPassword:$Password")
    }
}

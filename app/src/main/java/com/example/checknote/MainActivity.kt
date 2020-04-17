package com.example.checknote

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var welcomepage: TextView
    var password:String? = "abc"
    var PhoneNo:String? ="0000"
    var email: String? =" abc@gmail.com"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.activity_main)
        welcomepage = findViewById(R.id.welcomepage)
        if (intent != null)
        {
            PhoneNo = intent.getStringExtra("phoneNo")
            password = intent.getStringExtra("password")
           email = intent.getStringExtra("email")

        }

            PhoneNo = sharedPreferences.getString("phoneNo",PhoneNo)
            password = sharedPreferences.getString("password",password)
            welcomepage.setText(" WELCOME!! \n Your Phone NO is $PhoneNo\nYour Password is $password\n Ypur email is $email ")




}

}


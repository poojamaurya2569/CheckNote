package com.example.checknote

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignUp : AppCompatActivity() {
 lateinit var name : EditText
    lateinit var EmailAddress : EditText
    lateinit var PhoneNo: EditText
    lateinit var DiliveryAdress : EditText
    lateinit var passward:EditText
    lateinit var Regester:Button
    lateinit var Name:String
    lateinit var email:String
    lateinit var phoneNo:String
    lateinit var diliveryAddress:String
    lateinit var Password:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        name = findViewById(R.id.name)
        EmailAddress = findViewById(R.id.email)
        PhoneNo = findViewById(R.id.mobileNumber)
        DiliveryAdress = findViewById(R.id.deliveryAdrress)
        passward = findViewById(R.id.passward)
        Regester = findViewById(R.id.register)


        Regester.setOnClickListener {
            Name = name.text.toString()
            email= EmailAddress.text.toString()
            phoneNo = PhoneNo.text.toString()
            diliveryAddress = DiliveryAdress.text.toString()
            Password = passward.text.toString()
            val intent = Intent(this@SignUp,RegestranionDetails::class.java)
            intent.putExtra("name",Name)
            intent.putExtra("email",email)
            intent.putExtra("phoneNo",phoneNo)
            intent.putExtra("dilivery",diliveryAddress)
            intent.putExtra("password",Password)
            startActivity(intent)


            }
        }

    override fun onPause() {
        super.onPause()
        finish()
    }
    }



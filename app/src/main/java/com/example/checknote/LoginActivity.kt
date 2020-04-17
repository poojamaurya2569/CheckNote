package com.example.checknote

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
lateinit var sharedPreferences: SharedPreferences
lateinit var PhoneNumber : EditText
    lateinit var Password: EditText
    lateinit var ForgotPassword:TextView
    lateinit var Signup:TextView
    lateinit var Login:Button
     var PhoneNo = "0000111222"
    var password = "abc"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn",false)
        setContentView(R.layout.activity_login)
        if (isLoggedIn){
            val intent = Intent(this@LoginActivity,MainActivity::class.java)
            startActivity(intent)
        }

       PhoneNumber = findViewById(R.id.mobileNumber)
        Password = findViewById(R.id.passward)
        ForgotPassword = findViewById(R.id.forgotPasward)
        Signup = findViewById(R.id.register)
        Login = findViewById(R.id.loginBtn)

        Login.setOnClickListener {

            PhoneNo = PhoneNumber.text.toString()
            password = Password.text.toString()
            userPreferences(PhoneNo,password)
            val intent = Intent(this@LoginActivity,MainActivity::class.java)
           // intent.putExtra("phoneNo",PhoneNo)
            //intent.putExtra("password",password)
            startActivity(intent)
            }

      Signup.setOnClickListener {
    val intent = Intent(this@LoginActivity,SignUp::class.java)
    startActivity(intent)
}

ForgotPassword.setOnClickListener {
    val intent = Intent(this@LoginActivity,ForgotPage::class.java)
    startActivity(intent)
}
        }
fun userPreferences(phoneNo:String,password:String)
{
    sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
    sharedPreferences.edit().putString("phoneNo",phoneNo).apply()
    sharedPreferences.edit().putString("password",password).apply()
}

    override fun onPause() {
        super.onPause()
        finish()

    }
}

package com.example.myproject_mid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Appname:TextView
    lateinit var loginemail:EditText
    lateinit var loginpass:EditText
    lateinit var btnlogin:Button
    lateinit var gotoregister:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Appname=findViewById(R.id.txt_login)
        loginemail=findViewById(R.id.edt_loginemail)
        loginpass=findViewById(R.id.edt_loginpass)
        btnlogin=findViewById(R.id.login)
        gotoregister=findViewById(R.id.txt_gotoregister)

        gotoregister.setOnClickListener {
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }

    }
}
package com.example.myproject_mid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Register : AppCompatActivity() {
    lateinit var TVregister:TextView
    lateinit var username:EditText
    lateinit var enteremail:EditText
    lateinit var enterphone:EditText
    lateinit var enterpass:EditText
    lateinit var confirmpass:EditText
    lateinit var register:Button
    lateinit var gototlogin:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        TVregister=findViewById(R.id.txt_register)
        username=findViewById(R.id.edt_username)
        enteremail=findViewById(R.id.edt_email)
        enterphone=findViewById(R.id.edt_phone)
        enterpass=findViewById(R.id.edt_password)
        confirmpass=findViewById(R.id.edt_confirmpassword)
        register=findViewById(R.id.button)
        gototlogin=findViewById(R.id.txt_gotologin)

        gototlogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
signup()
    }
    private fun signup() {
        val email = enteremail.text.toString()
        val pass = enterpass.text.toString()
        val confirmpass = confirmpass.text.toString()

        if (email.isBlank() || pass.isBlank() || confirmpass.isBlank()) {
            Toast.makeText(this, "Please email and password cannot be blank", Toast.LENGTH_LONG)
                .show()
            return
        } else if (pass != confirmpass) {
            Toast.makeText(this, "Password do not match", Toast.LENGTH_LONG).show()
            return
        }
    }

}
package com.example.my_contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.my_contact.R

class ViewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        getExtras()
    }

    fun getExtras(){
        val extras = intent.extras
        val name = extras?.getString("NAME","")
        val email = extras?.getString("EMAIL","")
        val phoneNumber = extras?.getString("PHONENUMBER","")
        val address = extras?.getString("ADDRESS","")
//        val cont = binding.imgCont


        Toast.makeText(this, "$name: $email", Toast.LENGTH_LONG).show()
    }
}
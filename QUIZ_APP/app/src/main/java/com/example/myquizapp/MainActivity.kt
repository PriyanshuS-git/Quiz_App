package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.et_name)
        val btnStart : Button = findViewById(R.id.btn_start)
//Intent just say from which activity we want to move to which other activity where this is current activity and other name
// activity is the destination activity. startActivity(intent) help us to open destination activity but it will not close already open activity.

        btnStart.setOnClickListener {

            if(etName.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter your name !",Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                 startActivity(intent)
                finish()

            }

        }

    }
}
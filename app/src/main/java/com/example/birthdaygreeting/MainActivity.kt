package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.birthdaygreeting.databinding.ActivityMainBinding

//import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun createBirthdayCard(view: View) {
        val name = binding.nameInput.editableText.toString()
        if(name==""){
            Toast.makeText(this, "Enter a name", Toast.LENGTH_LONG).show()
        }
//        Toast.makeText(this, "Button was $name", Toast.LENGTH_LONG).show()
        else {
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}
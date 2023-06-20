package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaygreeting.databinding.ActivityBirthdayGreetingBinding

//import androidx.wear.tiles.material.Text
//import kotlinx.android.synthetic.main.activity_birthday_greeting.*
//import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreetingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBirthdayGreetingBinding

    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(NAME_EXTRA)
        binding.showBirthday.text="Happy Birthday\n$name"
    }
}
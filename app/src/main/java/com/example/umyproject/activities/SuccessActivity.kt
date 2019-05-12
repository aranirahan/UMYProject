package com.example.umyproject.activities


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umyproject.R.layout
import kotlinx.android.synthetic.main.activity_success.btn_back_to_menu

class SuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_success)

        btn_back_to_menu.setOnClickListener { finish() }
    }
}

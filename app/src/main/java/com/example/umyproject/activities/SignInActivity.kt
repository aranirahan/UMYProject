package com.example.umyproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umyproject.R.layout
import kotlinx.android.synthetic.main.activity_sign_in.btn_login
import org.jetbrains.anko.startActivity

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_sign_in)

        btn_login.setOnClickListener {
            startActivity<DashActivity>()
        }
    }
}

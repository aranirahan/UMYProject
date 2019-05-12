package com.example.umyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umyproject.activities.SignInActivity
import org.jetbrains.anko.startActivity
import java.util.Timer
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timer("SettingUp", false).schedule(500) {
            startActivity<SignInActivity>()
        }
    }
}

package com.example.umyproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umyproject.R.layout
import kotlinx.android.synthetic.main.activity_form_event.btn_next
import org.jetbrains.anko.startActivity

class FormEventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_form_event)

        btn_next.setOnClickListener {
            finish()
            startActivity<SuccessActivity>()
        }
    }
}

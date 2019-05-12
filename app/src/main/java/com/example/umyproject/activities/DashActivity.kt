package com.example.umyproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.umyproject.R.layout
import com.example.umyproject.adapters.NewsAdapter
import com.example.umyproject.adapters.OtherEventAdapter
import com.example.umyproject.model.News
import com.example.umyproject.model.OtherEvent
import kotlinx.android.synthetic.main.activity_dash.ll_daftar_event
import kotlinx.android.synthetic.main.activity_dash.rv_news
import kotlinx.android.synthetic.main.activity_dash.rv_other_event
import org.jetbrains.anko.startActivity

class DashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_dash)

        setupOtherEventAdapter()

        setupNewsAdapter()

        ll_daftar_event.setOnClickListener {
            startActivity<FormEventActivity>()
        }
    }

    private fun setupOtherEventAdapter() {
        val otherEventList = listOf(
            OtherEvent("BIRO UMUM", "Milad Fakultas Ilmu Pemerintah"),
            OtherEvent("BEM FISIPOL", "Prom Night FISIPOL"),
            OtherEvent("BIRO UMUM", "Milad Fakultas Ilmu Pemerintah"),
            OtherEvent("BEM FISIPOL", "Prom Night FISIPOL"),
            OtherEvent("BIRO UMUM", "Milad Fakultas Ilmu Pemerintah"),
            OtherEvent("BEM FISIPOL", "Prom Night FISIPOL"),
            OtherEvent("BIRO UMUM", "Milad Fakultas Ilmu Pemerintah"),
            OtherEvent("BEM FISIPOL", "Prom Night FISIPOL")
        )
        rv_other_event.isNestedScrollingEnabled = false
        rv_other_event.layoutManager = LinearLayoutManager(this@DashActivity, LinearLayoutManager.HORIZONTAL, false)
        rv_other_event.adapter = OtherEventAdapter(otherEventList) {

        }
    }

    private fun setupNewsAdapter() {
        val newsList = listOf(
            News("Izin cuman pake jempol aja!\nDAFTARKAN EVENTMU DI"),
            News("Izin cuman pake jempol aja!\nDAFTARKAN EVENTMU DI"),
            News("Izin cuman pake jempol aja!\nDAFTARKAN EVENTMU DI"),
            News("Izin cuman pake jempol aja!\nDAFTARKAN EVENTMU DI"),
            News("Izin cuman pake jempol aja!\nDAFTARKAN EVENTMU DI"),
            News("Izin cuman pake jempol aja!\nDAFTARKAN EVENTMU DI"),
            News("Izin cuman pake jempol aja!\nDAFTARKAN EVENTMU DI")
        )

        rv_news.isNestedScrollingEnabled = false
        rv_news.layoutManager = LinearLayoutManager(this@DashActivity, LinearLayoutManager.HORIZONTAL, false)
        rv_news.adapter = NewsAdapter(newsList) {

        }
    }
}

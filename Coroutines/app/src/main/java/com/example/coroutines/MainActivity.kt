package com.example.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val mainLayout : ConstraintLayout = findViewById(R.id.main_layout)
        val tabs : TextView = findViewById(R.id.tv_taps)
        val title : TextView = findViewById(R.id.tv_title)

        mainLayout.setOnClickListener {
            viewModel.updateTabs()
        }

        viewModel.tabs.observe(this) {
            value ->
            tabs.text = "$value tabs"
        }
    }

}
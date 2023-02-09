package com.example.zemzhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zemzhelper.ui.screens.ModulesFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ModulesFragment.newInstance())
                .commitNow()
        }
    }
}
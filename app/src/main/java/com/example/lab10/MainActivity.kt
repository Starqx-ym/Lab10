package com.example.lab10

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.lab10.ui.theme.Lab10Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.lab10.view.SeriesApp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab10Theme {
                SeriesApp()
            }
        }
    }
}
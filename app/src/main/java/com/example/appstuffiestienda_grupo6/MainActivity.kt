package com.example.appstuffiestienda_grupo6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.appstuffiestienda_grupo6.ui.HomeScreen
import com.example.appstuffiestienda_grupo6.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = HomeViewModel()
        setContent {
            HomeScreen(viewModel)

        }
    }
}






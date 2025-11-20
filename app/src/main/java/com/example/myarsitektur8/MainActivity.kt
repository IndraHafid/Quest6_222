package com.example.myarsitektur8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.myarsitektur8.ui.theme.MyArsitektur8Theme
import com.example.myarsitektur8.view.uicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyArsitektur8Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    SiswaApp()
                }
            }
        }
    }
}

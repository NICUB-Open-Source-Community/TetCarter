package com.example.helcare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.helcare.presentation.HelCareScreen
import com.example.helcare.ui.theme.HelCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelCareTheme {

                HelCareScreen()
            }
        }
        }
    }


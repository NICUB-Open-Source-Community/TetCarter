package com.example.helcare.core.ui

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import com.example.helcare.navigation.HelCareNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun HelCareApp() {
    HelCareNavHost(navController = rememberAnimatedNavController())
}
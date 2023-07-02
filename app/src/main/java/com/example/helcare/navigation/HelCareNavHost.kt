package com.example.helcare.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.helcare.feature.onboarding.navigation.onboardingRoute
import com.example.helcare.feature.onboarding.navigation.onboardingScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun HelCareNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = onboardingRoute
) {
    AnimatedNavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        onboardingScreen(
            navigateToAuthentication = {
            }
        )
    }
}
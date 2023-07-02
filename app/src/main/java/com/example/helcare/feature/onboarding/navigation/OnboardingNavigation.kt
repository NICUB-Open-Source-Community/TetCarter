package com.example.helcare.feature.onboarding.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavGraphBuilder
import com.example.helcare.feature.onboarding.OnboardingRoute
import com.google.accompanist.navigation.animation.composable

const val onboardingRoute = "onboarding_route"

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.onboardingScreen(
    navigateToAuthentication: () -> Unit
) {
    composable(route = onboardingRoute) {
        OnboardingRoute(
            navigateToAuthentication = navigateToAuthentication
        )
    }
}
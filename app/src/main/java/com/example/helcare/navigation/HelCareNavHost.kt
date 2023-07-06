package com.example.helcare.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.navOptions
import com.example.helcare.feature.authentication.navigation.authGraph
import com.example.helcare.feature.authentication.navigation.doctorAuthGraph
import com.example.helcare.feature.authentication.navigation.navigateToAuth
import com.example.helcare.feature.authentication.navigation.navigateToDoctorAuthentication
import com.example.helcare.feature.authentication.navigation.navigateToDoctorLogin
import com.example.helcare.feature.authentication.presentation.User
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
                val navOptions = navOptions {
                    popUpTo(navController.graph.startDestinationId) {
                        inclusive = true
                    }
                }
                navController.navigateToAuth(navOptions)
            }
        )
        authGraph(
            navigateToRegistration = { user ->
                when (user) {
                    User.DOCTOR -> {
                        navController.navigateToDoctorAuthentication()
                    }

                    User.PATIENT -> {
                        //
                    }
                }
            },
            navigateToLogin = {
                // Todo: Check if it is a doctor or patient and navigate to the corresponding auth screen.
                navController.navigateToDoctorLogin()
            },
            nestedGraph = {
                doctorAuthGraph()
            }
        )
    }
}
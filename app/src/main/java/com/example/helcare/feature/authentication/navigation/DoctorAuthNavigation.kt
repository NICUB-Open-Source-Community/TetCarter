package com.example.helcare.feature.authentication.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import com.google.accompanist.navigation.animation.navigation

const val doctorAuthGraphRoute = "doctor_auth_graph_route"

fun NavController.navigateToDoctorAuthentication(navOptions: NavOptions? = null) {
    navigate(doctorAuthGraphRoute, navOptions)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.doctorAuthGraph() {
    navigation(
        route = doctorAuthGraphRoute,
        startDestination = doctorRegisterRoute
    ) {
        doctorRegisterScreen()
        doctorLoginScreen()
    }
}
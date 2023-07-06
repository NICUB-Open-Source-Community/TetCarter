package com.example.helcare.feature.authentication.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import com.example.helcare.feature.authentication.presentation.DoctorLoginRoute
import com.google.accompanist.navigation.animation.composable

const val doctorLoginRoute = "login_route"

fun NavController.navigateToDoctorLogin(navOptions: NavOptions? = null) {
    navigate(doctorLoginRoute, navOptions)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.doctorLoginScreen() {
    composable(route = doctorLoginRoute) {
        DoctorLoginRoute()
    }
}
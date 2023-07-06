package com.example.helcare.feature.authentication.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import com.example.helcare.feature.authentication.presentation.DoctorRegisterRoute
import com.google.accompanist.navigation.animation.composable

const val doctorRegisterRoute = "doctor_register_route"

fun NavController.navigateToDoctorRegister(navOptions: NavOptions? = null) {
    navigate(doctorRegisterRoute, navOptions)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.doctorRegisterScreen() {
    composable(route = doctorRegisterRoute) {
        DoctorRegisterRoute()
    }
}
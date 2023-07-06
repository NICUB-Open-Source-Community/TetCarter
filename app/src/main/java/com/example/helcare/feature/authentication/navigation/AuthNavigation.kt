package com.example.helcare.feature.authentication.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import com.example.helcare.feature.authentication.presentation.User
import com.google.accompanist.navigation.animation.navigation

const val authGraphRoute = "auth_graph_route"

fun NavController.navigateToAuth(navOptions: NavOptions? = null) {
    navigate(authGraphRoute, navOptions)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.authGraph(
    navigateToRegistration: (User) -> Unit,
    navigateToLogin: () -> Unit,
    nestedGraph: NavGraphBuilder.() -> Unit
) {
    navigation(
        route = authGraphRoute,
        startDestination = userSelectionRoute
    ) {
        userSelectionScreen(
            navigateToRegistration = navigateToRegistration,
            navigateToLogin = navigateToLogin
        )
        nestedGraph()
    }
}
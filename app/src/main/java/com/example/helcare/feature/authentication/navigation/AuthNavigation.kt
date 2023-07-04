package com.example.helcare.feature.authentication.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.navigation

const val authGraphRoute = "auth_graph_route"

fun NavController.navigateToAuth(navOptions: NavOptions? = null) {
    navigate(authGraphRoute, navOptions)
}

fun NavGraphBuilder.authGraph(
    navigateToRegistration: () -> Unit,
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
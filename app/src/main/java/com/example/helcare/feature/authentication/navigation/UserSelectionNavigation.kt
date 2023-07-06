package com.example.helcare.feature.authentication.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavGraphBuilder
import com.example.helcare.feature.authentication.presentation.User
import com.example.helcare.feature.authentication.presentation.UserSelectionRoute
import com.google.accompanist.navigation.animation.composable

const val userSelectionRoute = "user_selection_route"

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.userSelectionScreen(
    navigateToRegistration: (User) -> Unit,
    navigateToLogin: () -> Unit
) {
    composable(route = userSelectionRoute) {
        UserSelectionRoute(
            navigateToRegistration = navigateToRegistration,
            navigateToLogin = navigateToLogin
        )
    }
}
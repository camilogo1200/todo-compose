package com.camilogo1200.todocompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        title = "home",
        route = "home",
        icon = Icons.Default.Home
    )

    object Profile : BottomBarScreen(
        title = "Profile",
        route = "profile",
        icon = Icons.Default.Person
    )

    object Settings : BottomBarScreen(
        title = "Settings",
        route = "settings",
        icon = Icons.Default.Settings
    )
}
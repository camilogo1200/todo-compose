package com.camilogo1200.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.camilogo1200.todocompose.navigation.destinations.listComposable
import com.camilogo1200.todocompose.navigation.destinations.taskComposable
import com.camilogo1200.todocompose.util.Constants.LIST_SCREEN

@Composable
fun setupNavigation(navController: NavHostController) {
    val screen = remember(navController) {
        Screens(navController)
    }

    NavHost(navController, startDestination = LIST_SCREEN) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}
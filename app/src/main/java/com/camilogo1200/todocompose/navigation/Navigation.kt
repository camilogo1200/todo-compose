package com.camilogo1200.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.camilogo1200.todocompose.navigation.destinations.listComposable
import com.camilogo1200.todocompose.navigation.destinations.taskComposable

@Composable
fun SetupNavigation(navController: NavHostController) {
    val screen = remember(navController) {
        Screens(navController)
    }

    NavHost(navController, startDestination = Route.TaskList.route) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}

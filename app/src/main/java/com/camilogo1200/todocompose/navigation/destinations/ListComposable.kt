package com.camilogo1200.todocompose.navigation.destinations

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.camilogo1200.todocompose.navigation.Route


fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
) {
    composable(
        route = Route.TaskList.route,
        arguments = listOf(navArgument(Route.TaskList.argumentKey) {
            type = NavType.StringType
        })
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(text = "Task List", fontSize = MaterialTheme.typography.h3.fontSize)
            Button(onClick = { navigateToTaskScreen(10) }) {
                
            }
        }
    }
}
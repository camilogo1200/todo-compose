package com.camilogo1200.todocompose.navigation

import androidx.navigation.NavController
import com.camilogo1200.todocompose.util.Action
import com.camilogo1200.todocompose.util.Constants

class Screens(navController: NavController) {

    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(Constants.LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/${taskId}")
    }
}
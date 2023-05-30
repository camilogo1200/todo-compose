package com.camilogo1200.todocompose.navigation

sealed class Route(val route: String, val argumentKey: String) {
    object TaskList : Route(route = "task_list/{action}", argumentKey = "action")
    object TaskDetail : Route(route = "task_details_screen/{taskId}", argumentKey = "taskId")
}
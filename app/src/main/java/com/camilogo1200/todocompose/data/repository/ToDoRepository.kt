package com.camilogo1200.todocompose.data.repository

import com.camilogo1200.todocompose.data.ToDoDao
import com.camilogo1200.todocompose.data.models.Task
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(
    private val toDoDao: ToDoDao
) {

    val getAllTask: Flow<List<Task>> = toDoDao.getAllTask()
    val sortByLowPriority: Flow<List<Task>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<Task>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<Task> {
        return toDoDao.getSelectedTask(taskId)
    }

    suspend fun addTask(task: Task) {
        toDoDao.addTask(task)
    }

    suspend fun updateTask(task: Task) {
        toDoDao.updateTask(task)
    }

    suspend fun deleteTask(task: Task) {
        toDoDao.deleteTask(task)
    }

    suspend fun deleteAllTask() {
        toDoDao.deleteAllTask()
    }

    fun searchDatabase(searchQuery: String): Flow<List<Task>> {
        return toDoDao.searchDatabase(searchQuery)
    }

}
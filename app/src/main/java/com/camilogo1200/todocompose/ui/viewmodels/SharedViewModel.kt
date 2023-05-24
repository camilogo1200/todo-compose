package com.camilogo1200.todocompose.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.camilogo1200.todocompose.data.models.Task
import com.camilogo1200.todocompose.data.repository.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val repository: ToDoRepository
) : ViewModel() {
    
    private val _allTask = MutableStateFlow<List<Task>>(emptyList())
    val allTask: StateFlow<List<Task>> = _allTask

    fun getAllTask() {
        viewModelScope.launch {
            repository.getAllTask.collect {
                _allTask.value = it
            }
        }
    }

}
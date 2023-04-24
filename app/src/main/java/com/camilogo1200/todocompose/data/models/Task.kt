package com.camilogo1200.todocompose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.camilogo1200.todocompose.util.Constants

@Entity(tableName = Constants.DATABASE_TABLE_TASK)
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
package com.camilogo1200.todocompose.data.adapters.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.camilogo1200.todocompose.data.ToDoDao
import com.camilogo1200.todocompose.data.models.Task
import com.camilogo1200.todocompose.util.Constants

@Database(
    entities = [Task::class],
    version = Constants.DATABASE_VERSION
)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun toDoDao(): ToDoDao

}

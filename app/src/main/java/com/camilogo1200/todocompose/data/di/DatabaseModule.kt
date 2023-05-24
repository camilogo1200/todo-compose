package com.camilogo1200.todocompose.data.di

import android.content.Context
import androidx.room.Room
import com.camilogo1200.todocompose.data.ToDoDao
import com.camilogo1200.todocompose.data.adapters.persistence.ToDoDatabase
import com.camilogo1200.todocompose.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): ToDoDatabase {
        return Room.databaseBuilder(
            context, ToDoDatabase::class.java, DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun providesToDoDao(
        database: ToDoDatabase
    ): ToDoDao {
        return database.toDoDao()
    }
}
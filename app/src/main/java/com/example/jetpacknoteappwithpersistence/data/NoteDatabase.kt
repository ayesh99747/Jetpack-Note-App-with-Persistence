package com.example.jetpacknoteappwithpersistence.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.jetpacknoteappwithpersistence.model.Note
import com.example.jetpacknoteappwithpersistence.util.DateConverter
import com.example.jetpacknoteappwithpersistence.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {
    // Function that will give us the DAO
    abstract fun noteDao():NoteDatabaseDao
}
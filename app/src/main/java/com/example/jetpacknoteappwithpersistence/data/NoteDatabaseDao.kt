package com.example.jetpacknoteappwithpersistence.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.jetpacknoteappwithpersistence.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * The DAO Manages local data from the SQLite data source using objects.
 */
@Dao
interface NoteDatabaseDao {

    @Query("SELECT * FROM notes_table")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM notes_table WHERE id=:id")
    suspend fun getNoteById(id: String): Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateNote(note: Note)

    @Query("DELETE FROM notes_table")
    suspend fun deleteAll()

    @Delete
    suspend fun deleteNote(note: Note)

}

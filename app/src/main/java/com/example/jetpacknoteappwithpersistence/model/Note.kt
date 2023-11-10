package com.example.jetpacknoteappwithpersistence.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.time.LocalDateTime
import java.util.Date
import java.util.UUID

@Entity(tableName = "notes_table")
data class Note(
    // Each time a note is created we are generating a random id.
    @PrimaryKey
    val id: UUID = UUID.randomUUID(),

    @ColumnInfo(name = "note_title")
    val title: String,

    @ColumnInfo(name = "note_description")
    val description: String,

    // Any new note will have a timestamp when this was created
    @ColumnInfo(name = "note_entry_date")
    val entryDate: Date = Date.from(Instant.now())
)
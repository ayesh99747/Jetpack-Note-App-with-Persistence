package com.example.jetpacknoteappwithpersistence.data

import java.time.LocalDateTime
import java.util.UUID

data class Note (
    // Each time a note is created we are generating a random id.
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    // Any new note will have a timestamp when this was created
    val entryDate: LocalDateTime = LocalDateTime.now()
)
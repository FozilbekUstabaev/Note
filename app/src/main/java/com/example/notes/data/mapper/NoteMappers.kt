package com.example.notes.data.mapper

import com.example.notes.data.model.NoteEntity
import com.example.notes.damain.model.Note

fun Note.toNoteEntity() = NoteEntity(
    id, title, description, createdAt
)

fun NoteEntity.toNote() = Note(
    id, title, description, createdAt
)
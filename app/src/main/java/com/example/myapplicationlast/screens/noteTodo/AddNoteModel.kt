package com.example.myapplicationlast.screens.noteTodo

import com.example.myapplicationlast.db.NoteDao
import com.example.myapplicationlast.db.NoteEntity

class AddNoteModel(private val noteDao: NoteDao) {
    fun addNote(note: NoteEntity){
        noteDao.addNote(note)
    }
}
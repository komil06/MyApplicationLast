package com.example.myapplicationlast.screens.noteTodo

import com.example.myapplicationlast.db.NoteEntity

class AddNoteViewModel(private val addNoteModel: AddNoteModel){
    fun addNote(note: NoteEntity){
        addNoteModel.addNote(note)
    }
}
package com.example.myapplicationlast.screens.main

import com.example.myapplicationlast.db.NoteDao
import com.example.myapplicationlast.db.NoteEntity

class AllNotesModel(private val noteDao: NoteDao) {

    fun getAllNotes():List<NoteEntity>{
        return noteDao.getAllNotes()
    }
}
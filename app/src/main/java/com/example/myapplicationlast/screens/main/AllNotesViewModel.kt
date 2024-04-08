package com.example.myapplicationlast.screens.main

import androidx.lifecycle.MutableLiveData
import com.example.myapplicationlast.db.NoteEntity

class AllNotesViewModel(private val allNotesModel:AllNotesModel){
    private val _notesList: MutableLiveData<List<NoteEntity>> = MutableLiveData()
    val notesList: MutableLiveData<List<NoteEntity>> = _notesList

    fun getAllList(): MutableLiveData<List<NoteEntity>> {
        _notesList.value = allNotesModel.getAllNotes()
        return notesList
    }
}
package com.example.myapplicationlast.db

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.RoomDatabase
import androidx.room.Update

@Entity
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    val note: String,
    val date:String
)

@Dao
interface NoteDao{
    @Insert
    fun addNote(note: NoteEntity)

    @Delete
    fun deleteNote(note:NoteEntity)

    @Query("SELECT * FROM NoteEntity")
    fun getAllNotes():List<NoteEntity>

    @Update
    fun editNote(note: NoteEntity)
}

@Database(
    version = 1,
    entities = [NoteEntity::class]
)
abstract class AppDatabase: RoomDatabase(){
    abstract fun getNoteDao(): NoteDao
}



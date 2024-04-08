package com.example.myapplicationlast.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplicationlast.db.NoteDao
import com.example.myapplicationlast.screens.main.AllNotesModel
import com.example.myapplicationlast.screens.main.AllNotesScreen
import com.example.myapplicationlast.screens.main.AllNotesViewModel
import com.example.myapplicationlast.screens.noteTodo.AddNoteModel
import com.example.myapplicationlast.screens.noteTodo.AddNoteScreen
import com.example.myapplicationlast.screens.noteTodo.AddNoteViewModel

@Composable
fun AppNavHost(navController: NavHostController, noteDao: NoteDao){
    NavHost( navController = navController, startDestination = Screens.AllNotesScreen.route){
        val mvm = AllNotesViewModel(AllNotesModel(noteDao))
        composable(Screens.AllNotesScreen.route){
               AllNotesScreen(navController,mvm)
        }
        val addNoteViewModel = AddNoteViewModel(AddNoteModel(noteDao))
        composable(Screens.AddNoteScreen.route){
            AddNoteScreen(navController,addNoteViewModel)
        }
    }
}
package com.example.myapplicationlast.navigation

sealed class Screens(val route: String){
    object AllNotesScreen:Screens("all_screen")
    object AddNoteScreen:Screens("add_screen")
}
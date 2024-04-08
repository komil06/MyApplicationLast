package com.example.myapplicationlast.screens.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.myapplicationlast.R
import com.example.myapplicationlast.item.NoteItem

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AllNotesScreen(navController: NavController, mvm:AllNotesViewModel){
    val noteList = mvm.getAllList().value
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate("add_screen")
                },
                shape = CircleShape
            ) {
                Icon(painter = painterResource(id = R.drawable.add), contentDescription = null)
            }
        }
    ) {
        LazyColumn (
            modifier = Modifier.fillMaxSize()
        ) {
            items(noteList!!.size) {
                NoteItem(noteList[it])
            }
        }
    }

}
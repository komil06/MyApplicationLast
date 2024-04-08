package com.example.myapplicationlast.screens.noteTodo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplicationlast.db.NoteEntity

@Composable
fun AddNoteScreen(navController: NavController, addNoteModel: AddNoteViewModel){
    val text = remember { mutableStateOf("") }
    val description = remember { mutableStateOf("") }
    val date = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Card {
            Row(modifier = Modifier, horizontalArrangement = Arrangement.SpaceEvenly) {
                TextField(value = "Write main text", onValueChange = {text.value = it})
                TextField(value = "Write date ", onValueChange = {date.value = it})
            }
            Spacer(modifier = Modifier.height(30.dp))
            TextField(value = "Write dectiption", onValueChange = {description.value = it})
        }
        Button(
            onClick = {
                addNoteModel.addNote(NoteEntity(note = text.value,date = date.value))
                navController.navigate("all_screen")
            },
            modifier = Modifier.padding(16.dp)) {
            Text(text = "Add")
        }
    }
}
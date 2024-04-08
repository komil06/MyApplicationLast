package com.example.myapplicationlast

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.example.myapplicationlast.db.AppDatabase
import com.example.myapplicationlast.navigation.AppNavHost
import com.example.myapplicationlast.ui.theme.MyApplicationLastTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationLastTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    val appDatabase:AppDatabase by lazy {
                        Room.databaseBuilder(this, AppDatabase::class.java,"database.db")
                            .createFromAsset("room_article.db")
                            .build()
                    }
                    AppNavHost(navController = rememberNavController(), appDatabase.getNoteDao())
                }
            }
        }
    }
}


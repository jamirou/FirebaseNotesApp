package com.example.firebasenotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import com.example.firebasenotesapp.navigation.NavManager
import com.example.firebasenotesapp.ui.theme.FirebaseNotesAppTheme
import com.example.firebasenotesapp.viewModels.LoginViewModel
import com.example.firebasenotesapp.viewModels.NotesViewModel
import com.example.firebasenotesapp.views.login.TabsView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val loginVM: LoginViewModel by viewModels()
        val notesVM: NotesViewModel by viewModels()
        setContent {
            FirebaseNotesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavManager(loginVM, notesVM )
                }
            }
        }
    }
}


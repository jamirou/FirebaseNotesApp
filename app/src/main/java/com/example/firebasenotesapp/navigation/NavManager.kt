package com.example.firebasenotesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasenotesapp.viewModels.LoginViewModel
import com.example.firebasenotesapp.viewModels.NotesViewModel
import com.example.firebasenotesapp.views.login.BlankView
import com.example.firebasenotesapp.views.login.TabsView
import com.example.firebasenotesapp.views.notes.AddNoteView
import com.example.firebasenotesapp.views.notes.HomeView

@Composable
fun NavManager(loginVM: LoginViewModel, notesVM: NotesViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Blank") {
        composable("Blank") {
            BlankView(navController)
        }
        composable("Login") {
            TabsView(navController, loginVM)
        }
        composable("Home") {
            HomeView(navController, notesVM)
        }
        composable("AddNoteView") {
            AddNoteView(navController, notesVM)
        }
    }
}
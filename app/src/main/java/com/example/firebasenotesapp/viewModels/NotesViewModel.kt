package com.example.firebasenotesapp.viewModels

import android.icu.text.CaseMap.Title
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class NotesViewModel : ViewModel() {
    private val auth: FirebaseAuth = Firebase.auth
    private val firestore = Firebase.firestore

    fun saveNewNote(title: String, note: String, onSuccess: () -> Unit) {
        val email = auth.currentUser?.email
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val newNote = hashMapOf(
                    "title" to title,
                    "note" to note,
                    "date" to formatDate(),
                    "emailUser" to email.toString()
                )
                firestore
                    .collection("Notes")
                    .add(newNote)
                    .addOnSuccessListener {
                        onSuccess()
                    }
            } catch (e: Exception) {
                Log.d("ERROR SAVING DATA", "Error saving ${e.localizedMessage}")
            }
        }
    }

    private fun formatDate(): String {
        val currentDate: Date = Calendar.getInstance().time
        val res = SimpleDateFormat("dd/MM/yyy", Locale.getDefault())
        return res.format(currentDate)
    }

    fun signOut() {
        auth.signOut()
    }

}
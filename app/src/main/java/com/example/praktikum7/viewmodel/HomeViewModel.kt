package com.example.praktikum7.viewmodel

import androidx.lifecycle.ViewModel
import com.example.praktikum7.repositori.RepositoriSiswa
import com.example.praktikum7.room.Siswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa):ViewModel() {

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }

    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )
}
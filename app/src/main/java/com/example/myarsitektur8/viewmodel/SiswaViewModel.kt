package com.example.myarsitektur8.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myarsitektur8.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()
    fun setSiswa(listDataSiswa: List<String>) {
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = listDataSiswa.getOrNull(0) ?: "",
                gender = listDataSiswa.getOrNull(1) ?: "",
                alamat = listDataSiswa.getOrNull(2) ?: ""
            )
        }
    }
}

package com.example.pertemuan8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    private val _mahasiswaStateUI = MutableStateFlow(Mahasiswa())
    val mahasiswaUiState : StateFlow<Mahasiswa> = _mahasiswaStateUI.asStateFlow()

    fun saveDataMhs(
        listData : MutableList<String>
    ) {
        _mahasiswaStateUI.value = Mahasiswa(
            nim = listData[0],
            nama = listData[1],
            email = listData[2]
        )
    }
}

package com.example.pertemuan8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    private val _dataModel = MutableStateFlow(Mahasiswa())
    val datMode: StateFlow<Mahasiswa> =_dataModel.asStateFlow()

    fun saveDataMhs(
        listData : MutableList<String>
    ) {
        _dataModel.update { mhs ->
            mhs.copy(
                nama = listData[0],
                nim = listData[1],
                email = listData[2],
            )
        }
    }
}
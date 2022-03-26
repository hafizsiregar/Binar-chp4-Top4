package com.example.feedig_binar_chp4_top4.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ini halaman explore"
    }
    val text: LiveData<String> = _text
}
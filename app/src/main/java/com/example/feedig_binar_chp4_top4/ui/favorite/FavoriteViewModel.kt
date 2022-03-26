package com.example.feedig_binar_chp4_top4.ui.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavoriteViewModel : ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "Ini halaman favorite"
    }
    val text: LiveData<String> = _text
}
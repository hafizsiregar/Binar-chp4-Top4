package com.example.feedig_binar_chp4_top4.ui.reels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReelsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ini halaman reels"
    }
    val text: LiveData<String> = _text
}
package com.example.feedig_binar_chp4_top4.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel :  ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "Ini halaman profile"
    }
    val text: LiveData<String> = _text
}
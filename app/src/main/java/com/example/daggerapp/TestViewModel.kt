package com.example.daggerapp

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("randomName2") randomName2 :String
):ViewModel() {
    init {
       Log.d("viewModel","test string from viewModel $randomName2")
    }
}
package com.example.androidlf

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel()
{
    private val _counter=MutableLiveData<Int>()
    val counter:LiveData<Int> get()=_counter
    init {
        _counter.value=0
    }
    fun inc(){
        _counter.value=(_counter.value?:0)+1
    }
}
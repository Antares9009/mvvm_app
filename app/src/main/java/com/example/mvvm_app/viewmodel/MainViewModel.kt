package com.example.mvvm_app.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_app.model.DataItem
import com.example.mvvm_app.model.DataItemProvider
import kotlin.random.Random

class MainViewModel : ViewModel() {

    val itemLD = MutableLiveData<List<DataItem>>()

    fun getItems(){
        val items = DataItemProvider.getDataItems(Random.nextInt(100))
        itemLD.value = items
    }
}
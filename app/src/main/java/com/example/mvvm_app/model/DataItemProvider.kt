package com.example.mvvm_app.model

object DataItemProvider{
    fun getDataItems(size: Int) =
        (0..size).toList().map{ DataItem(it) }
}
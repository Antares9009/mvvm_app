package com.example.mvvm_app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.mvvm_app.R
import com.example.mvvm_app.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val viewmodel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observeViewModel()
    }

    private fun observeViewModel() {
        viewmodel.itemLD.observe(this, Observer { itemList ->
            imageView.setImageResource(R.drawable.ic_ok)
            textView2.text = "Received ${itemList.size} items"
            textView2.visibility = View.VISIBLE
        })
    }

    fun getItems(v: View){
        viewmodel.getItems()
    }
}
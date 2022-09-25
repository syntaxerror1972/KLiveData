package com.syntaxerror.klivedata.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.syntaxerror.klivedata.R
import com.syntaxerror.klivedata.viewmodel.MainViewModel

/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KLiveData.
 * Package Id : com.syntaxerror.klivedata.viewmodel
 * Created By :  Shrawan Shinde
 * Created Date :  24,September,2022
 *
 *** Contact Details ***
 *
 * Name : Shrawan B. Shinde
 * Email : syntaxerror1972@gmail.com
 * Github Link : https://github.com/syntaxerror1972/KLiveData
 * LinkedIn Link : https://in.linkedin.com/in/shrawan-shinde-59ba57a1
 * Copyright (c) 2022. All rights reserved.
 *
 **************************************************************************************
 */
class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel : MainViewModel
    lateinit var displayText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayText = findViewById(R.id.displayText)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.testLiveData.observe(this, Observer{
            displayText.text = it
        })
    }

    fun updateData(view:View){
        mainViewModel.updateLiveData()
    }
}
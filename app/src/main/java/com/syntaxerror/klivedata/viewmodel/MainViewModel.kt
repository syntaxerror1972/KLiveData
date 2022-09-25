package com.syntaxerror.klivedata.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

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

class MainViewModel : ViewModel() {
    val testLiveData = MutableLiveData<String>("My initial Data")

    fun updateLiveData(){
        testLiveData.value = "Data after updating"
    }
}
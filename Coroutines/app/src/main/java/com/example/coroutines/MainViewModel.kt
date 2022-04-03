package com.example.coroutines

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val tabs: MutableLiveData<Int> = MutableLiveData()

    var tabsCount = 0

    fun updateTabs() {
        viewModelScope.launch {
            tabsCount++
            tabs.postValue(tabsCount)
        }
    }
}
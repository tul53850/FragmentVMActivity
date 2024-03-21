package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {

    private val side = MutableLiveData<Int>()
    private val roll = MutableLiveData<Int>()

    fun setSide(num: Int){ side.value = num }

    fun getSide() : LiveData<Int> { return side }

    fun setRoll(num: Int){ roll.value = num }

    fun getRoll() : LiveData<Int> { return roll }
    
}
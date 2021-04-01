package kr.co.dynamicmedia.viewmodelexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AccViewModel: ViewModel(){
    private var inputText: MutableLiveData<String> = MutableLiveData()

    fun getInputText() = inputText

    fun updateText(newText: String){
        inputText.value = newText
    }
}

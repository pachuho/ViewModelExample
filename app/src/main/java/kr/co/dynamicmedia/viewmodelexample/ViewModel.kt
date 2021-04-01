package kr.co.dynamicmedia.viewmodelexample

import android.view.View
import android.widget.Toast
import androidx.databinding.ObservableField

class ViewModel {
    val text = ObservableField<String>("")

    fun showText(view: View){
        Toast.makeText(view.context, "${text.get()}", Toast.LENGTH_SHORT).show()
    }
}
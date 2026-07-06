package pt.iefp.a08_mvvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel: ViewModel() {

    // txt original
    private val _nome = MutableStateFlow("Gonçalo")
        // get
        // set

    val nome = _nome.asStateFlow()
        // get


    // txt TextField

    private val _txtTF = MutableStateFlow("")
    val txtTF = _txtTF.asStateFlow()


    fun alterarNome(novoNome: String){
        _nome.value =  novoNome
    }

    fun updateTxtTF(novoValor: String){
        _txtTF.value = novoValor
    }


}

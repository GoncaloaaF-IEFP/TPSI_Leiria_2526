package pt.iefp.a08_mvvm

import android.app.appsearch.Migrator
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iefp.a08_mvvm.ui.theme._08_MVVMTheme

class MainActivity : ComponentActivity() {
    val vm: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home(vm)
        } // setContent
    }//fun onCreate
} //class MainActivity


@Composable
fun Home(vm: MainViewModel){
    val nomeLocal = vm.nome.collectAsState() // mostrar valores

    // garanta que uso o txtTF vindo do vm
    // var txtTFLocal by remember{ mutableStateOf("") }
    var txtTFLocal = vm.txtTF.collectAsState() // mostrar valores

    Column{
        Spacer(modifier = Modifier.height(25.dp))

        Text(nomeLocal.value,
            fontSize = 30.sp
            )


        TextField(value = txtTFLocal.value, onValueChange = {
            vm.updateTxtTF(it)

        })
        /*

        Garanta que depois de mudar o nome a limpa a caixa de texto
        Garanta que so muda o nome se o conteúdo da caixa de texto
            tiver mais de 3 letras


         */
        Button(onClick = {

            vm.alterarNome(txtTFLocal.value)

        }, modifier = Modifier.fillMaxWidth()) {
            Text("Mudar nome")
        }


    }



}

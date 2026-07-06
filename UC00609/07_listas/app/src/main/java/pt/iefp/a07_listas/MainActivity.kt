package pt.iefp.a07_listas

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.log


class MainActivity : ComponentActivity() {

    val nomes = listOf("Ana 34", "Bruno 34", "Carlos 34", "Diana 34",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column{
                header("Gonçalo")
                listaLayoutClikckRow(nomes)
            }
        }//setContent
    }
}

@Composable
fun header(nome: String){
    Text("Ola mundo, $nome",
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(
            top = 25.dp, start = 16.dp))
}

@Composable
fun listaBasica(){
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana",)

    LazyColumn {
        items(nomes){ nome ->
            Text(nome)
        }
    }
}

@Composable
fun listaBasicaLayout(){
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana",)

    LazyColumn(contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)) {
        items(nomes){ nome ->
            BaseListRow(nome)
        }
    }
}
@Composable
fun BaseListRow(nome: String){

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .height(45.dp)
            .background(Color.Red)
    ) {
        Text(nome,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

@Composable
fun listaLayoutClick(){
    val nomes = listOf("Ana 22", "Bruno 22", "Carlos 22", "Diana 22",)

    LazyColumn(contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)) {


        items(nomes){ nome ->

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .height(45.dp)
                    .background(Color.Red)
                    .clickable{
                        Log.d("aula", "Click na lista $nome")

                    }
            ) {
                Text(nome,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White)
            }
        }


        //Lista com Layout e row
    }

}

@Composable
fun listaLayoutClikckRow(nomes: List<String>) {

    LazyColumn(contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)) {
        items(nomes){ nome ->
            listaRowClick(nome){ nome, nome_len ->
                Log.d("aula", "o nome $nome tem $nome_len letras")

            }
        }
    }
}
@Composable
fun listaRowClick(nome: String, onClick: (nome: String, n_l: Int) -> Unit){

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .height(45.dp)
            .background(Color.Red)
            .clickable{
                val nome_len = nome.length
                onClick(nome, nome_len)
            }
    ) {
        Text(nome,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}



// adapte o ex da sessão passada de forma a que quando selecionam um nome aparece no ecrã
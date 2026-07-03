package pt.iefp.a07_listas

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iefp.a07_listas.ui.theme._07_listasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column{
                header("Gonçalo")
                listaBasicaLayout()
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




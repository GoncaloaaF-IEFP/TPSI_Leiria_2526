package pt.iefp.a10_appnav

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(verticalArrangement = Arrangement.Center,
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(horizontal = 16.dp)){
                AppNav()
            }
        }
    }
}


@Composable
fun AppNav(){

    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "home") {

        composable("home") {
            HomeScreen(navController)
        }

        composable("detalhe/{nome}") {
            var nome = it.arguments?.getString("nome")
            DetalheScreen(navController,nome )
        }
    }
}

@Composable
fun HomeScreen(navCtrl: NavController){
    var ctx = LocalContext.current

    var nomeTF by remember { mutableStateOf("") }
    Column {
        Text("homa page - homeScreen 2 ",
            modifier = Modifier
            .fillMaxWidth()
            .height(35.dp))

        TextField(value = nomeTF, onValueChange = {
            nomeTF = it
        },
            modifier = Modifier.fillMaxWidth()) // TextField

        Button(onClick = {
            if (nomeTF.length >= 3) {
                navCtrl.navigate("detalhe/$nomeTF")
            }else{

                Toast.makeText(ctx,
                    "nome tem de ter mais de 3 letras",
                    Toast.LENGTH_LONG
                ).show()

            }
        }, modifier = Modifier
            .fillMaxWidth()) {
            Text("Go to View 2")
        } // Button


    }// Column
}// HomeScreen


@Composable
fun DetalheScreen(navCtrl: NavController, nome: String?){

    Column{
        Text("Pagina 2")
        Text("Ola $nome")
        Button(onClick = {
            navCtrl.popBackStack()
        }) {
            Text("Voltar")
        }
    }
}
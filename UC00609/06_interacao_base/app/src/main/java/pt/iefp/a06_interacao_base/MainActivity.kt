package pt.iefp.a06_interacao_base

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var nome by remember { mutableStateOf("Gonçalo") }
            var txt1 by remember { mutableStateOf("") }

            Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {


                Text(nome,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(vertical = 25.dp, horizontal = 16.dp))

                TextField(
                    value = txt1,
                    onValueChange = {
                        txt1 = it
                },
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 16.dp))



                Button(onClick = {

                    Log.d("aula", nome)
                    nome = txt1

                }, modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 16.dp)) {
                    Text("Mudar nome")
                }

            }// Column
        }// setContent
    }
}


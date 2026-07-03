package pt.iefp.a05_dorid_intro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var nome = "Gonçalo"

            Column {

                Text(
                    "Ola Mundo $nome",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = Color.White,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .background(Color.Red)
                        .size(width = 300.dp, height = 150.dp)
                ) // text

                Text(
                    "Ola Mundo2  $nome",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = Color.White,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .background(Color.Red)
                        .size(width = 300.dp, height = 150.dp)
                ) // text

                Row {
                    Text("txt1", modifier = Modifier
                        .size(width = 100.dp, height = 100.dp)
                        .background(Color.Blue)
                    )

                    Spacer(modifier = Modifier.width(10.dp))
                    Text("txt2", modifier = Modifier
                        .size(width = 100.dp, height = 100.dp)
                        .background(Color.Green)
                    )

                }
            }

        }// setContent

    }
}

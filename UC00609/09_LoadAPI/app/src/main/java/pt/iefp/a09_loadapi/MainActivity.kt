package pt.iefp.a09_loadapi

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : ComponentActivity() {

    //private var vm: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
            ) {

                Button(onClick = {
                    Log.d("Aula", "inico load all")
                    loadAllComments()
                    Log.d("Aula", "fim load all")
                }){
                    Text("Load all cmt")
                }

                Button(onClick = {
                    Log.d("Aula", "inico load cmt id 1")
                    loadComment(1)

                    Log.d("Aula", "fim load cmt id 1")
                }){
                    Text("Load all cmt")
                }


            }

        }
    }
}


fun loadAllComments(){

    RetrofitInstance.api.getComments().enqueue(object:Callback<List<Comment>>{
        override fun onResponse(
            call: Call<List<Comment>?>,
            response : Response<List<Comment>?>
        ) {
                if(response.isSuccessful){
                    response.body()?.let{
                        for (cmt in it){
                            Log.d("Aula", cmt.email)

                        }
                    }
                }
            }

        override fun onFailure(
            call: Call<List<Comment>?>,
            t: Throwable
        ) {
            Log.e("Aula", "Erro: ${t.message}")
        }

    })

}



fun loadComment( id: Int){

}

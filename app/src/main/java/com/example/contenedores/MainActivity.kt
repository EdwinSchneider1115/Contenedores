package com.example.contenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contenedores.ui.theme.ContenedoresTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showSystemUi=true)
@Composable
fun ContentScreen(){
    Column(
        modifier=Modifier.
            background(Color.Magenta).
            padding(18.dp).
            fillMaxWidth(),
        verticalArrangement= Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier
                .background(Color.Blue)
                .padding(18.dp)
                .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Inicio",
                fontSize = 25.sp,
                modifier = Modifier .background(Color.Red).padding(8.dp)
            )
            Text(
                text = "Perfil",
                fontSize = 25.sp,
                modifier = Modifier .background(Color.Green).padding(8.dp)
            )
            Text(
                text = "Configuracion",
                fontSize = 25.sp,
                modifier = Modifier .background(Color.Yellow).padding(8.dp)
            )
        }


        Text(
            text="Titulo Principal",
            fontSize=25.sp,
            modifier=Modifier .background(Color.Yellow).padding(8.dp)
        )
        Text(
            text="Descripcion",
            fontSize=25.sp,
            modifier=Modifier .background(Color.Yellow).padding(8.dp)
        )
        Text(
            text="Configuracion",
            fontSize=25.sp,
            modifier=Modifier .background(Color.Yellow).padding(8.dp)
        )}
}

@Preview(showSystemUi=true)
@Composable
fun ContentScreen2(){
    Column(

        modifier=Modifier.
        padding(18.dp).
        fillMaxWidth(),
        verticalArrangement= Arrangement.SpaceBetween,
        horizontalAlignment =  Alignment.CenterHorizontally) {
        val painter = painterResource(id= R.drawable.chulito )
        Image(painter = painter,contentDescription = null,
            modifier=Modifier
            .padding(top=200.dp)  //dp para ancho
            .align(Alignment.CenterHorizontally)
            .width(width = 250.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "All tasks completed",
            fontSize = 25.sp,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = "Nice work",
            fontSize = 25.sp,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showSystemUi=true)
@Composable
fun Cuadrados(){
    Column(

        modifier=Modifier.
        padding(18.dp).
        fillMaxWidth(),
        verticalArrangement= Arrangement.SpaceBetween,
        horizontalAlignment =  Alignment.CenterHorizontally) {
        val painter = painterResource(id= R.drawable.chulito )
        Image(painter = painter,contentDescription = null)

        Row(
            modifier = Modifier
                .background(Color.Blue)
                .padding(18.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "All tasks completed",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.Red).padding(8.dp)
            )
            Text(
                text = "Nice work",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.Green).padding(8.dp)
            )
        }
    }
}
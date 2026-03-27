package com.example.jose_cueavpc

import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jose_cueavpc.ui.theme.Jose_CueavPCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jose_CueavPCTheme {
                Scaffold { paddingValues ->
                    Greeting("Verificador Bisiesto", Modifier.padding(paddingValues))
                }
            }
        }
    }



    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Button(onClick= {Verificador_Bisiesto()}  , modifier = modifier) {
            Text(text = "$name")
        }
    }
    @Composable
    fun IngresarDatos( modifier: Modifier = Modifier){
        Button(onClick= {}  , modifier = modifier) {
            Text(text = "Ingrese un año")
        }

    }

    fun Verificador_Bisiesto(){
        var anio = 0
        var fecha = java.util.Calendar.getInstance()
            anio = fecha.get(java.util.Calendar.YEAR)
            Toast.makeText(this, "El año actual es: $anio", Toast.LENGTH_SHORT).show()
        if ((anio % 4==0 && anio %100 !=0) || (anio % 400==0)){
            println("El año $anio es bisiesto")
            Toast.makeText(this, "El año $anio es bisiesto", Toast.LENGTH_SHORT).show()
        }else{
            println("El año $anio no es bisiesto")
            Toast.makeText(this, "El año $anio NOO es bisiesto", Toast.LENGTH_SHORT).show()

    }
}
    }




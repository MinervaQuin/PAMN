package com.example.cuadrante

import android.net.wifi.ScanResult.InformationElement
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrante.ui.theme.CuadranteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Cuadrante(modifier: Modifier = Modifier) {
    Column (Modifier.fillMaxWidth()){
        Row(Modifier.weight(1f)){
                Information(information = "Displays text and follows the recommended Material Design guidelines.",
                    title = "Text composable", backColor =Color(0xFFEADDFF), modifier = Modifier.weight(1f) )

                Information(information = "Creates a composable that lays out and draws a given Painter class object.",
                title = "Image composable", backColor =Color(0xFFD0BCFF), modifier = Modifier.weight(1f) )


        }
        Row(Modifier.weight(1f)){


            Information("A layout composable that places its children in a horizontal sequence.",
                "Row composable",backColor = Color(0xFFB69DF8), modifier = Modifier.weight(1f))

            Information("A layout composable that places its children in a vertical sequence.",
                "Column composable",backColor = Color(0xFFF6EDFF), modifier = Modifier.weight(1f))


        }
    }


}

@Composable
fun Information(information: String, title: String,backColor: Color, modifier: Modifier = Modifier){
    Column (modifier = modifier
        .fillMaxSize()
        .background(backColor)
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "$title",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(text = "$information",
            textAlign = TextAlign.Justify
        )
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteTheme {
        //ComposeQuadrantApp()
        Cuadrante()
    }
}



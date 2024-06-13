package com.lambao.jetpackcompose.training

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lambao.jetpackcompose.training.ui.theme.TrainingJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrainingJetpackComposeTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color.White
                ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .wrapContentSize()
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(
        color = Color.White,
        modifier = modifier
    ) {
        Text(
            text = "Hello $name!",
            color = Color.Red,
            modifier = Modifier
                .border(1.dp, Color.Black, shape = RoundedCornerShape(20.dp))
                .padding(20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TrainingJetpackComposeTheme {
        Greeting("Android")
    }
}
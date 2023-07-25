package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Happy Birthday siri", "from Apple")
                }
            }
        }
    }
}

// todo i will go to

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {

    Box() {

        Image(
            painter = painterResource(id = R.drawable.bcard),
            contentDescription = "Template",
            contentScale = ContentScale.FillBounds,
            alpha = 10f,
            modifier = Modifier
                .fillMaxSize()
                .scale(1f)
                .padding(10.dp)
        )

        Box(
            modifier = Modifier
                .scale(0.5f)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(
                    text = name,
                    color = Color.White,
                    fontSize = 100.sp,
                    lineHeight = 116.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(10.dp)
//                    .border(BorderStroke(
//                        Color()
//                    ))
                )
                    Text(
                        text = from,
                        color = Color.White,
                        modifier = Modifier
                            .align(CenterHorizontally),
                        fontSize = 36.sp,
                    )

            }
        }
        Column(

        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HappyBirthdayTheme {
        Greeting("Happy Birthday Alexa", "from Amazon")
    }
}
package com.example.my_app_2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.*
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun TextStyleScreen(modifier: Modifier = Modifier) {
    Scaffold {
        innerPadding-> Column (
            modifier = modifier.padding(innerPadding)
                .fillMaxWidth()
        ){
            Text("Welcome to JetPack",
                color = Color.Red,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        Text(
            text = "Welcome to JetPack",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineLarge.copy( // Combine styles here
                color = Color.Red,
                textDecoration = TextDecoration.Underline,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                shadow = Shadow(
                    color = Color(0xFF1C862A),
                    offset = Offset(5.0f, 5.0f),
                )
            )
        )
        Text(
            text = "Welcome to JetPack",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineLarge.copy( // Combine styles here
                // color = Color.Red, // Remove this line
                textDecoration = TextDecoration.Underline,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                shadow = Shadow(
                    color = Color(0xFF1C862A),
                    offset = Offset(5.0f, 5.0f),
                ),
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF1C862A),
                        Color.Red,
                        Color.Blue,

                    )
                )
            )
        )
        Row{
            Text(text = "Android")
            Text(text = "Android")
        }
//
        }


    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun TextStyleScreenPreview(modifier: Modifier = Modifier) {
    TextStyleScreen()
}
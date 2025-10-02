package com.example.myapp_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RowText(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.LightGray),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "Fairfield",
            modifier = modifier
                .background(Color(0xFF89C984)),
            fontSize = 20.sp
        )
        Text(
            text = "Iowa",
            modifier = modifier
                .background(Color(0xFF03A9F4)),
            fontSize = 20.sp
        )
        Text(
            text = "USA",
            modifier = modifier
                .background(Color(0xFFF2F3F5)),
            fontSize = 20.sp
        )
    }
}

@Preview(showBackground = false)
@Composable
fun MyTextPreview() {
    RowText()
}
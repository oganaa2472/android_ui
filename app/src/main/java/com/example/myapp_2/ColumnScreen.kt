package com.example.myapp_2


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    showBackground = true
)

@Composable
fun RowScreenPreview(modifier: Modifier = Modifier) {
    Scaffold {
        innerPadding->
        Column(
            modifier =Modifier.padding(
                innerPadding
            ).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier.border(
                    width = 2.dp,
                    color = Color.Black,
                    shape = CircleShape
                )
            )
            Text(
                text = "Maharishi International University"
            )

        }
    }
}
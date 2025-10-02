package com.example.my_app_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Scaffold

@Composable
fun LazyColumnScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        val myCatList = listOf(
            "Miu", "Leo", "Bella", "Charlie", "Lucy", "Max",
            "Chloe", "Simba", "Luna", "Oliver", "Nala", "Tiger"
        )
        val myCatList2 = listOf(
            Item(R.string.compro_admission_team, R.drawable.compro_admission_team), // Make sure you have these drawables
            Item(R.string.compro_professionals, R.drawable.compro_professionals),
            Item(R.string.faculty_student, R.drawable.faculty_student),
            Item(R.string.friends, R.drawable.friends),
            Item(R.string.graduation, R.drawable.graduation),
            Item(R.string.miu_campus, R.drawable.miu_campus),
            Item(R.string.rainbow, R.drawable.rainbow),
            Item(R.string.sustainable_living, R.drawable.sustainable_living_center),
            // Add more cats as needed
        )
        LazyColumn(modifier = modifier.padding(innerPadding)) {
            item{
                Text(text = "Miu")
            }
            items(myCatList) { catName ->
                // This block is executed for each item in myCatList
                Text(text = "Cat name: $catName")
            }
            item {
                Text(text = "Footer: End of the list")
            }
            items(myCatList2){cat->
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        // Use stringResource to convert the ID to a String
                        text = stringResource(id = cat.name),
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(bottom = 8.dp) // Changed padding for better spacing
                    )
                    Image(
                        painter = painterResource(id = cat.imageRes),
                        contentDescription = stringResource(id = cat.name), // Also good to use it here
                        modifier = Modifier.fillMaxWidth()
                    )
                }
//
            }
//


        }

    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun LazyColumnScreenPreview(modifier: Modifier = Modifier) {
    LazyColumnScreen()
}

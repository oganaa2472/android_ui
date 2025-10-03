package com.example.my_app_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyHorGridScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
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
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = modifier.padding(innerPadding)
        ){
            items(myCatList2){cat->
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card{

                        Image(
                            painter = painterResource(id = cat.imageRes),
                            contentDescription = stringResource(id = cat.name), // Also good to use it here
                            modifier = Modifier.fillMaxWidth().height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            // Use stringResource to convert the ID to a String
                            text = stringResource(id = cat.name),
                            style = MaterialTheme.typography.bodyLarge,

                            modifier = Modifier.padding(bottom = 8.dp).fillMaxWidth()

                            // Changed padding for better spacing
                        )
                        Spacer(Modifier.height(8.dp))
                    }

                }
//
            }
        }

    }
}
@Preview(
    showSystemUi = true
)
@Composable
fun LazyHorGridScreenPreview(modifier: Modifier = Modifier) {
    LazyHorGridScreen()
}

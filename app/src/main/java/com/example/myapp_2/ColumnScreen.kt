package com.example.myapp_2


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun BoxScreen(modifier: Modifier = Modifier) {
    Scaffold {
            innerPadding ->

            Box(
                modifier = modifier.padding(innerPadding)
            ){
                var myImage by remember {
                    mutableStateOf(Icons.Default.Person)
                }
                Image(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Lock Icon",
                    modifier = Modifier.size(50.dp).align(
                        Alignment.TopStart
                    )
                )
                Image(
                    imageVector = myImage,
                    contentDescription = "Lock Icon" ,
                    modifier = Modifier.size(200.dp).align(
                        Alignment.TopCenter
                    ).clickable(
                        onClick = {
                            if(myImage == Icons.Default.Person){
                                myImage = Icons.Default.Lock
                            }else{
                                myImage = Icons.Default.Person
                            }
                        }
                    )
                )
                Image(
                    imageVector = Icons.Default.Favorite ,
                    contentDescription = "Lock Icon" ,
                    modifier = Modifier.size(50.dp).align(
                        Alignment.TopEnd
                    ).clickable(
                        onClick = {
                            if(myImage == Icons.Default.Person){
                                myImage = Icons.Default.Lock
                            }else{
                                myImage = Icons.Default.Person
                            }
                        }
                    )
                )
            }


    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun BoxScreenPreview(modifier: Modifier = Modifier) {
    BoxScreen()
}

package com.example.my_app_2


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.my_app_2.ui.theme.My_app_2Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            My_app_2Theme {
                // Set BoxScreen as the main content of the activity
                RegistrationScreen(modifier = Modifier.fillMaxSize())

            }
        }
    }
}

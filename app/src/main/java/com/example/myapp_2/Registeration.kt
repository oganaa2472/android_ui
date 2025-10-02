package com.example.my_app_2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RegistrationScreen(modifier: Modifier = Modifier) {
    Scaffold {
        innerPadding ->
        Column(modifier = modifier.padding(innerPadding))
        {
            var username by remember { mutableStateOf("") }
            TextField(
                value = username,
                onValueChange = {data->
                    username = data
                },
                label = {
                    Text(text = "username")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),

                modifier = Modifier.fillMaxWidth().padding(start = 10.dp,end = 10.dp)
            )
            var password by remember { mutableStateOf("") }
            OutlinedTextField(

                value = password,
                onValueChange = {data->
                    password = data
                },
                label = {
                    Text(text = "password")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = androidx.compose.ui.text.input.PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp,end = 10.dp)
            )
            var phonenumber by remember { mutableStateOf("") }
            OutlinedTextField(

                value = phonenumber,
                onValueChange = {data->
                    phonenumber = data
                },
                label = {
                    Text(text = "phonenumber")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone
                ),

                modifier = Modifier.fillMaxWidth().padding(start = 10.dp,end = 10.dp)
            )
        }

    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun RegistrationScreenPreview(modifier: Modifier = Modifier) {
    RegistrationScreen()
}
package com.example.my_app_2
import android.widget.Toast
import androidx.compose.ui.text.style.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import androidx.compose.ui.platform.LocalContext

@Composable
fun RegistrationScreen(modifier: Modifier = Modifier) {
    Scaffold {
        innerPadding ->
        Column(modifier = modifier.padding(innerPadding))
        {
            var username by remember { mutableStateOf("") }
            val context = LocalContext.current
            var errorMessage by remember { mutableStateOf(false) }
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
                supportingText = {
                    if(errorMessage){
                        Text(text = "Please enter username and password")
                    }
                },
                isError = errorMessage,
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp,end = 10.dp),
                trailingIcon = {
                    if(errorMessage){
                        Text(text = "Error",color = MaterialTheme.colorScheme.error)
                    }
                }

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
            val genderOptions = listOf("Male", "Female" )
            var selectedGender by remember { mutableStateOf(genderOptions[0]) }

            genderOptions.forEach { gender ->
                Row {
                    RadioButton(
                        selected = (gender == selectedGender),
                        onClick = {
                            selectedGender = gender
                        }
                    )
                    Text(text = gender)
                }
            }
            Row(
                modifier = Modifier.padding(8.dp).fillMaxWidth()
            ) {
                Button(
                    onClick = {
                        username = ""
                        selectedGender = genderOptions[0]
                        phonenumber = ""
                        password = ""
                    /* Handle registration logic here */ },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text("Clear")
                }
                Button(

                    onClick = {
                        if(username.isEmpty() || password.isEmpty()){
                            errorMessage = true
                            Toast.makeText(context, "Please enter username and password", Toast.LENGTH_SHORT).show()
                            return@Button
                        }else{
                            errorMessage = false
                        }
                        /* Handle registration logic here */
                        Toast.makeText(context, "Registration Successful for $username", Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier.padding(8.dp)
                    ) {
                    Text("Forgot Password")
                }
                Button(
                    onClick = {  Toast.makeText(context, "Registration Successful", Toast.LENGTH_SHORT).show() },
                    modifier = Modifier.padding(8.dp)
                ){
                    Text("Register")

                }
            }
        }

    }
}

@Preview(
    showSystemUi = true,
)
@Composable
fun RegistrationScreenPreview(modifier: Modifier = Modifier) {
    RegistrationScreen()
}

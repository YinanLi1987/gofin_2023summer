package com.example.gofin2.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gofin2.R

@Composable
fun Log(navController: NavController){

    var email: String by remember { mutableStateOf("") }
    var passWord: String by remember { mutableStateOf("") }
    var passwordVisibility: Boolean by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier.padding(8.dp)
    ) {
        Text(
            text = ("Log in"),
            color = MaterialTheme.colors.primary,
            fontSize = 24.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email Icon") },
            label = { Text(text = ("Email"))},
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        OutlinedTextField(
            value = passWord,
            onValueChange = {passWord=it},
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            leadingIcon = {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }){
                    Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock Icon") }
            },

            label = { Text(text = ("Password"))},
            singleLine = true,

            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick={navController.navigate("account")},
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = ("Next"))
        }
        Button(
            onClick={navController.navigate("account")},
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = ("Back"))
        }
        Button(
            onClick={  navController.navigate("sign")  },
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = ("Create a new account?"))
        }

    }
}
@Composable
fun Sign(navController: NavController){
    var email: String by remember { mutableStateOf("") }
    var passWord: String by remember { mutableStateOf("") }
    var passWordConfirm: String by remember { mutableStateOf("") }
    var passwordVisibility: Boolean by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier.padding(8.dp)
    ) {
        Text(
            text = ("Sign"),
            color = MaterialTheme.colors.primary,
            fontSize = 24.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email Icon") },
            label = { Text(text = ("Email"))},
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        OutlinedTextField(
            value = passWord,
            onValueChange = {passWord=it},
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            leadingIcon = {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }){
                    Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock Icon") }
            },

            label = { Text(text = ("Password"))},
            singleLine = true,

            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = passWordConfirm,
            onValueChange = {passWordConfirm=it},
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            leadingIcon = {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }){
                    Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock Icon") }
            },

            label = { Text(text = ("Password confirm"))},
            singleLine = true,

            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick={navController.navigate("log")},
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = ("Submit"))
        }
        Button(
            onClick={navController.navigate("account")},
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = ("Back"))
        }
        Button(
            onClick={  navController.navigate("log")  },
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = ("Already have an account"))
        }

    }
}
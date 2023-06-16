package com.example.gofin2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.gofin2.ui.navigation.TopMenu

@Composable
fun Account(navController: NavController) {
        Column(modifier = Modifier.fillMaxSize()) {
                TopMenu(navController)
        Text(text = "This is the ACCOUNT screen")
        Button(onClick = {  navController.navigate("log")  }) {
                Text(text = "Log in")
        }
                Button(onClick = {  navController.navigate("sign")  }) {
                        Text(text = "Sign")
                }


}}
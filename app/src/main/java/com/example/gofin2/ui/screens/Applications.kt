package com.example.gofin2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.gofin2.ui.navigation.TopMenu

@Composable
fun Applications(navController: NavController) {
    Column() {
        TopMenu(navController)
    Text(text = "This is the APPLICATIONS screen")
}}
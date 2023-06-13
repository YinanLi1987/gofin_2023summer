package com.example.gofin2.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Coffee
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.gofin2.R


@Composable
fun TopBar(navController: NavController) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    var expanded by remember { mutableStateOf(false) }

    TopAppBar(
        navigationIcon = {
            IconButton(
                modifier = Modifier.padding(7.dp),
                onClick = { navController.navigate("universities") }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "",
                )
            }},
        title = {
            Text(
                text = "Let's go Finland!",
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Light
            )},
        backgroundColor = Color.White,
        actions = {
            IconButton(
                onClick = { expanded=!expanded }
            ) {
                Icon(
                    Icons.Filled.MoreVert,
                    contentDescription = null,
                    tint = MaterialTheme.colors.primaryVariant
                )
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded=false }) {
                DropdownMenuItem(
                    onClick = {navController.navigate("study")},

                    ) {
                    Icon(
                        Icons.Filled.Coffee,
                        contentDescription = null,
                        tint = MaterialTheme.colors.primaryVariant
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Study",
                        color = MaterialTheme.colors.primary
                    )
                }
                DropdownMenuItem(onClick = { navController.navigate("account") }) {
                    Icon(
                        Icons.Filled.AccountCircle,
                        contentDescription = null,
                        tint = MaterialTheme.colors.primaryVariant
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Account",
                        color = MaterialTheme.colors.primary
                    )
                }
                DropdownMenuItem(
                    onClick = {navController.navigate("universities")
                       },

                    ) {
                    Icon(
                        Icons.Filled.Logout,
                        contentDescription = null,
                        tint = MaterialTheme.colors.primaryVariant
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Logout",
                        color = MaterialTheme.colors.primary
                    )
                }
            }
        }
    )
}
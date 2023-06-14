package com.example.gofin2.ui.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Score
import androidx.compose.material.icons.filled.Task
import androidx.compose.runtime.*
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.gofin2.model.TabItem

@Composable
fun TopMenu(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route


    val items = listOf(
        TabItem("Universities", Icons.Filled.School, "universities"),
        TabItem("Exercises", Icons.Filled.Score, "exercises"),
        TabItem("Application", Icons.Filled.Task, "applications"),

        )
    var selectedItem by remember { mutableStateOf(0) }
    BottomNavigation() {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index

                    navController.navigate(item.route)
                },
                icon = { Icon(item.icon, contentDescription = null) },
                label = { Text(item.label) }
            )
        }
    }
}
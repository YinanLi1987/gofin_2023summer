package com.example.gofin2.ui.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.gofin2.model.TabItem

@Composable
fun BottomNav(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route


    val items = listOf(
        TabItem("Study", Icons.Filled.Score,"study"),
        TabItem("Todo", Icons.Filled.Task,"todo"),
        TabItem("Account", Icons.Filled.AccountBox,"account"),
    )
    var selectedItem by remember { mutableStateOf(0) }
    BottomNavigation() {
        items.forEachIndexed{index, item ->
            BottomNavigationItem(
                selected = selectedItem== index,
                onClick = {
                    selectedItem =index

                    navController.navigate(item.route)
                },
                icon = {Icon(item.icon, contentDescription = null)},
                label ={ Text(item.label)}
            )
        }
    }

}
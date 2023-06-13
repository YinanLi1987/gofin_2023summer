package com.example.gofin2.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.gofin2.ui.navigation.BottomNav
import com.example.gofin2.ui.navigation.NavGraph
import com.example.gofin2.ui.navigation.TopBar
import com.example.gofin2.ui.theme.GoFin2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoFin2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                    contentColor = MaterialTheme.colors.onPrimary
                ) {
                    MainScreen()
                }
            }
        }
    }
}
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(

        topBar = { TopBar(navController) },
        content = { NavGraph(navController=navController ) },
        bottomBar = { BottomNav(navController) }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GoFin2Theme {
        MainScreen()
    }
}
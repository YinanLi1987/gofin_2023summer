package com.example.gofin2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.gofin2.ui.screens.*
import androidx.navigation.compose.NavHost

@Composable
fun NavGraph(modifier: Modifier = Modifier, navController: NavHostController) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavRoute.Universities.path
    ) {
        addUniversities(navController, this)
        addExercises(navController, this)
        addApplications(navController, this)
        addStudy(navController, this)
        addTodo(navController, this)
        addAccount(navController, this)
    }
}

private fun addUniversities(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Universities.path) {
        Universities(navController = navController)
    }
}
private fun addExercises(
    navController: NavController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Exercises.path) {

        Exercises( navController = navController)
    }
}
private fun addApplications(
    navController: NavController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Applications.path) {

        Applications(navController = navController)
    }
}

private fun addStudy(
    navController: NavController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Study.path) {

        Study(navController = navController )
    }
}
private fun addTodo(
    navController: NavController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Todo.path) {

        Todo(navController = navController )
    }
}
private fun addAccount(
    navController: NavController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Account.path) {
        Account(navController = navController )
    }
}

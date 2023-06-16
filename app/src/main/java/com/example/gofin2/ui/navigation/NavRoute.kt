package com.example.gofin2.ui.navigation

sealed class NavRoute(val path: String) {

    object Universities: NavRoute("universities")
    object Exercises: NavRoute("exercises")
    object Applications: NavRoute("applications")
    object Study: NavRoute("study")
    object Todo: NavRoute("todo")
    object Account: NavRoute("account")
    object Log: NavRoute("log")
    object Sign: NavRoute("sign")




    // build navigation path (for screen navigation)
    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/$arg")
            }
        }
    }

    // build and setup route format (in navigation graph)
    fun withArgsFormat(vararg args: String) : String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/{$arg}")
            }
        }
    }
}
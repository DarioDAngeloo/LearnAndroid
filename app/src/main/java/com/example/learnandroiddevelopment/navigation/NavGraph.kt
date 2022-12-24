package com.example.learnandroiddevelopment.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.learnandroiddevelopment.util.Constants.KOTLIN_ARGUMENT_KEY

@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screen.Splash.route) {

        composable(route = Screen.Splash.route) {

        }
        composable(route = Screen.OnBoarding.route) {

        }
        composable(route = Screen.Home.route) {

        }
        composable(
            route = Screen.Details.route, arguments = listOf(navArgument(name = KOTLIN_ARGUMENT_KEY) {
                type = NavType.IntType
            })
        ) {

        }
        composable(route = Screen.Search.route) {

        }


    }
}
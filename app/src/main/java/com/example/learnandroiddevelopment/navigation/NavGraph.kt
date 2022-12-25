package com.example.learnandroiddevelopment.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.learnandroiddevelopment.presentation.screens.home.HomeScreen
import com.example.learnandroiddevelopment.presentation.screens.onboarding.OnboardingScreen
import com.example.learnandroiddevelopment.presentation.screens.splash.SplashScreen
import com.example.learnandroiddevelopment.util.Constants.KOTLIN_ARGUMENT_KEY
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun SetupNavGraph() {

    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Screen.Splash.route) {

        composable(route = Screen.Splash.route) {
            SplashScreen(navHostController = navHostController)
        }
        composable(route = Screen.OnBoarding.route) {
            OnboardingScreen(navHostController = navHostController)
        }
        composable(route = Screen.Home.route) {
                HomeScreen(navHostController = navHostController)
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
package com.example.learnandroiddevelopment.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object OnBoarding : Screen("onboarding_screen")
    object Home : Screen("home_screen")
    object Details : Screen("details_screen/{kotlinCardId}") {
        fun passInfoId(kotlinCardId: Int): String {
            return "details_screen/$kotlinCardId"
        }
    }
    object Search : Screen ("search_screenn")

}

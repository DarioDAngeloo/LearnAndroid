package com.example.learnandroiddevelopment.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object OnBoarding : Screen("onboarding_screen")
    object Home : Screen("home_screen")
    object Details : Screen("details_screen/{kotlinInfoId}") {
        fun passInfoId(kotlinInfoId: Int): String {
            return "details_screen/$kotlinInfoId"
        }
    }
    object Search : Screen ("search_screen")

}

package com.example.learnandroiddevelopment.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color
import com.example.learnandroiddevelopment.navigation.Screen

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF3700B3)


val SplashLight = Color(0xFFF3F2FF)
val SplashDark = Color(0xFF4E4D65)

val TextSplash1 = Color(0xFF4D4C4E)
val TextSplash2 = Color(0xFFFF9800)

val Colors.onBoardingScreen
get() = if (isLight) SplashLight else SplashDark
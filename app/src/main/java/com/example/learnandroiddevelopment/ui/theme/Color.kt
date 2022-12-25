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

val TextSplash1 = Color(0xFF888888)
val TextSplash2 = Color(0xFFE7E7E7)

val TitleOnBoardingDay = Color(0xFF587ABB)
val TitleOnBoardingNight = Color(0xFFF9A826)

val DescOnBoardingDay = Color(0xFF5F5F5F)
val DescOnBoardingNight = Color(0xFFD7D7D7)

//progress onboarding
val ActiveDay = Color(0xFF587ABB)
val ActiveNight = Color(0xFFF9A826)

val InactiveDay = Color(0xFFD9D9D9)
val InactiveNight = Color(0xFFD9D9D9)




val Colors.textsOfSplashScreen
    get() = if (isLight) TextSplash1 else TextSplash2


val Colors.onBoardingScreen
get() = if (isLight) SplashLight else SplashDark

val Colors.onBoardingTitles
    get() = if (isLight) TitleOnBoardingDay else TitleOnBoardingNight

val Colors.onBoardingDesc
    get() = if (isLight) DescOnBoardingDay else DescOnBoardingNight

val Colors.progressActive
    get() = if (isLight) ActiveDay else ActiveNight

val Colors.progressInactive
    get() = if (isLight) InactiveDay else InactiveNight

val Colors.buttonColor
    get() = if (isLight) ActiveDay else ActiveNight
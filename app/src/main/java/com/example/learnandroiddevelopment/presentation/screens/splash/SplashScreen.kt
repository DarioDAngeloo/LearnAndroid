package com.example.learnandroiddevelopment.presentation.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.learnandroid.R
import com.example.learnandroiddevelopment.ui.theme.SplashDark
import com.example.learnandroiddevelopment.ui.theme.SplashLight

@Composable
fun SplashScreen(navHostController: NavHostController) {
    SplashComponent()
}

@Composable
fun SplashComponent() {

    val modifier = if(isSystemInDarkTheme()){
        Modifier.background(color = SplashDark)
    } else {
        Modifier.background(color = SplashLight)
    }

    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.mark),
            contentDescription = stringResource(R.string.splash_app_logo)
        )
    }
}

@Preview
@Composable
fun Preview() {
    SplashComponent()
}
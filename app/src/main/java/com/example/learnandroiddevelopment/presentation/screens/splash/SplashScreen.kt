package com.example.learnandroiddevelopment.presentation.screens.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.learnandroid.R
import com.example.learnandroiddevelopment.navigation.Screen
import com.example.learnandroiddevelopment.ui.theme.SplashDark
import com.example.learnandroiddevelopment.ui.theme.SplashLight
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navHostController: NavHostController) {

    val scale = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true){
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 1000,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
        delay(3000)
        navHostController.navigate(Screen.OnBoarding.route)
    }


    SplashComponent(scale.value)
}

@Composable
fun SplashComponent(scale: Float) {

    val modifier = if(isSystemInDarkTheme()){
        Modifier.background(color = SplashDark)
    } else {
        Modifier.background(color = SplashLight)
    }

    Column(
        modifier = modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(modifier = Modifier
            .weight(10f)
            .scale(scale),
            painter = painterResource(id = R.drawable.logoya),
            contentDescription = stringResource(R.string.splash_app_logo)
        )
        Image(modifier = Modifier.weight(2f),
            painter = painterResource(id = R.drawable.mark),
            contentDescription = stringResource(R.string.app_name)
        )
    }
}

@Preview
@Composable
fun Preview() {
    SplashComponent(scale = Float.MAX_VALUE)
}
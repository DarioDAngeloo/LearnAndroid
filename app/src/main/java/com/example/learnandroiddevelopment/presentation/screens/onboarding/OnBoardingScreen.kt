package com.example.learnandroiddevelopment.presentation.screens.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.learnandroiddevelopment.domain.model.OnBoardingPages
import com.example.learnandroiddevelopment.ui.theme.onBoardingScreen
import com.example.learnandroiddevelopment.util.Constants.ON_BOARDING_PAGES
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@Composable
fun OnboardingScreen(navHostController: NavHostController) {
    val pages = listOf(
        OnBoardingPages.First,
        OnBoardingPages.Second,
        OnBoardingPages.Third
    )

    val pagerState = rememberPagerState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.onBoardingScreen)
    ) {
        HorizontalPager(
            count = ON_BOARDING_PAGES,
            state = pagerState,
            verticalAlignment = Alignment.CenterVertically
        ) { it ->
            PageScreen(onBoardingPages = pages[it])
        }
    }
}

@Composable
fun PageScreen(onBoardingPages: OnBoardingPages){

}
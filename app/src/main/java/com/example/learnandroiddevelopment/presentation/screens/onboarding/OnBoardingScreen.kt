package com.example.learnandroiddevelopment.presentation.screens.onboarding

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.learnandroid.R
import com.example.learnandroiddevelopment.domain.model.OnBoardingPages
import com.example.learnandroiddevelopment.navigation.Screen
import com.example.learnandroiddevelopment.ui.theme.*
import com.example.learnandroiddevelopment.util.Constants.ON_BOARDING_PAGES
import com.google.accompanist.pager.*

@ExperimentalPagerApi
@Composable
fun OnboardingScreen(
    navHostController: NavHostController,
    onBoardingViewModel: OnBoardingViewModel = hiltViewModel()
) {
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
            modifier = Modifier.weight(10f),
            count = ON_BOARDING_PAGES,
            state = pagerState,
            verticalAlignment = Alignment.CenterVertically
        ) { pagePosition ->
            PageScreen(onBoardingPages = pages[pagePosition])
        }
        HorizontalPagerIndicator(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally),
            pagerState = pagerState,
            activeColor = MaterialTheme.colors.progressActive,
            inactiveColor = MaterialTheme.colors.progressInactive,
            indicatorWidth = 8.dp,
            spacing = 12.dp
        )
        FinishBtn(
            pagerState = pagerState, modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            onBoardingViewModel.saveOnBoardingState(completed = true)
            navHostController.navigate(Screen.Home.route)
        }
    }
}

@Composable
fun PageScreen(onBoardingPages: OnBoardingPages) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.fillMaxHeight(0.5f),
            painter = painterResource(id = onBoardingPages.image),
            contentDescription = stringResource(
                R.string.on_boarding_image
            )
        )
        Text(

            text = onBoardingPages.title,
            color = MaterialTheme.colors.onBoardingTitles,
            fontFamily = Poppins,
            fontWeight = FontWeight.SemiBold,
            fontSize = MaterialTheme.typography.h4.fontSize,
            textAlign = TextAlign.Center

        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            text = onBoardingPages.Description,
            color = MaterialTheme.colors.onBoardingDesc,
            fontFamily = Poppins,
            fontWeight = FontWeight.Light,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
            textAlign = TextAlign.Center
        )
    }
}

@ExperimentalPagerApi
@Composable
fun FinishBtn(modifier: Modifier, pagerState: PagerState, onClick: () -> Unit) {
    Row(
        modifier = modifier.padding(horizontal = 50.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center
    ) {
        AnimatedVisibility(
            visible = pagerState.currentPage == 2,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = onClick, colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    backgroundColor = MaterialTheme.colors.buttonColor
                )
            ) {
                Text(text = "Start learning")
            }
        }
    }
}
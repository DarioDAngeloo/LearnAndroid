package com.example.learnandroiddevelopment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.learnandroiddevelopment.navigation.SetupNavGraph
import com.example.learnandroiddevelopment.ui.theme.LearnAndroidDevelopmentTheme
import com.example.learnandroiddevelopment.ui.theme.SplashDark
import com.example.learnandroiddevelopment.ui.theme.SplashLight
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint
@ExperimentalPagerApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LearnAndroidDevelopmentTheme {


                SetupNavGraph()


            }
        }
    }
}



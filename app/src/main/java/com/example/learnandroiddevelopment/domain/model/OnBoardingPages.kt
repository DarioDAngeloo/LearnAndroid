package com.example.learnandroiddevelopment.domain.model

import androidx.annotation.DrawableRes
import com.example.learnandroid.R

sealed class OnBoardingPages(
    @DrawableRes
    val image: Int,
    val title: String,
    val Description: String,
) {
    object First : OnBoardingPages(
        image = R.drawable.first,
        title = "Road to Knowledge",
        Description = "Learn with the last and best examples from the official documents"

    )
    object Second : OnBoardingPages(
        image = R.drawable.second,
        title = "Take Notes",
        Description = "Find what you want to learn,  take some notes  and share your notes with everyone"

    )
    object Third : OnBoardingPages(
        image = R.drawable.third,
        title = "Be powerful",
        Description = "With all these new knowledge you are gonna learn , you’’ll be ready to start creating projects"

    )
}

package com.example.learnandroiddevelopment.domain.model

import androidx.annotation.DrawableRes
import com.example.learnandroid.R

sealed class OnBoardingPages(
    @DrawableRes
    val Image: Int,
    val Title: String,
    val Description: String,
) {
    object First : OnBoardingPages(
        Image = R.drawable.first,
        Title = "Road to Knowledge",
        Description = "Learn with the last and best examples from the official documents"

    )
    object Second : OnBoardingPages(
        Image = R.drawable.second,
        Title = "Take Notes",
        Description = "Find what you want to learn,  take some notes  and share your notes with everyone"

    )
    object Third : OnBoardingPages(
        Image = R.drawable.third,
        Title = "Be powerful",
        Description = "With all these new knowledge you are gonna learn , you’’ll be ready to start creating projects"

    )
}

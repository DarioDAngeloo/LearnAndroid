package com.example.learnandroiddevelopment.data.use_cases.save_onboarding

import com.example.learnandroiddevelopment.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed :Boolean){
        repository.savaOnBoardingState(completed = completed)
    }
}
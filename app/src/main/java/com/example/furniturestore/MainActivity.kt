package com.example.furniturestore

import android.R.attr.lineHeight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.furniturestore.main.HomeScreen
import com.example.furniturestore.presenttion.onboarding.OnboardingScreen
import com.example.furniturestore.presenttion.onboarding.OnboardingScreen2
import com.example.furniturestore.presenttion.onboarding.OnboardingScreen3
import com.example.furniturestore.presenttion.signup_signin.OTPVerification
import com.example.furniturestore.presenttion.signup_signin.SigninScreen
import com.example.furniturestore.presenttion.signup_signin.SignupScreen



//import com.example.furniturestore.presenttion.onboarding.OnboardingScreen
//import com.example.furniturestore.presenttion.onboarding.OnboardingScreen2
//import com.example.furniturestore.presenttion.onboarding.OnboardingScreen3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        installSplashScreen()

        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
//            NavHost(navController = navController, startDestination = "OnboardingScreen") {
//                composable("OnboardingScreen") {
//                    OnboardingScreen(navController = navController)
//                }
//                composable("OnboardingScreen2") {
//                    OnboardingScreen2(navController = navController)
//                }
//                composable("OnboardingScreen3") {
//                    OnboardingScreen3(navController = navController)
//                }
//                composable("SigninScreen") {
//                    SigninScreen(navController = navController)
//                }
//                composable("SignupScreen") {
//                    SignupScreen(navController = navController)
//                }
//                composable("OTPVerification") {
//                    OTPVerification(navController = navController)
//                }
//            }
            HomeScreen()
        }
    }
}







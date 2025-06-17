package com.coba.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.coba.auth.ui.signin.SigninScreen
import com.coba.auth.ui.signup.SignupScreen

class MainActivity : ComponentActivity() {
    sealed class Screen(val route: String) {
        object AuthSignin : Screen("auth/signin")
        object AuthSignup : Screen("auth/signup")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            com.coba.ui.theme.JelloBWATheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screen.AuthSignin.route
                ) {
                    composable(Screen.AuthSignin.route) {
                        SigninScreen(
                            navController = navController
                        )
                    }
                    composable(Screen.AuthSignup.route) {
                        SignupScreen(
                            navController = navController
                        )
                    }
                }
            }
        }
    }
}
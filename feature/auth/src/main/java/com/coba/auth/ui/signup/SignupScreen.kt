package com.coba.auth.ui.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.coba.ui.components.JelloButtonPrimary
import com.coba.ui.components.JelloButtonSosmedRow
import com.coba.ui.components.JelloEditText
import com.coba.ui.components.JelloImageViewClick
import com.coba.ui.components.JelloTextHeader
import com.coba.ui.components.JelloTextRegular
import com.coba.ui.components.JelloTextRegularWithClick
import com.coba.ui.components.JelloTextViewRow

@Composable
fun SignupScreen(
    navController: NavController = rememberNavController()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp)
            .background(Color.White)
    ) {
        JelloImageViewClick(
            onClick = {
                navController.popBackStack()
            }
        )

        Spacer(modifier = Modifier.height(30.dp))

        JelloTextHeader(
            text = "Create your account",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        JelloTextRegularWithClick(
            text = "Do you already have account ?",
            textClick = " Sign In",
            modifier = Modifier.padding(horizontal = 16.dp),
            onClick = {
                navController.popBackStack()
            }
        )

        Spacer(modifier = Modifier.height(25.dp))

        JelloTextRegular(
            text = "Username",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        JelloEditText(
            value = "Username"
        )

        Spacer(modifier = Modifier.height(10.dp))

        JelloTextRegular(
            text = "E-mail",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        JelloEditText()

        Spacer(modifier = Modifier.height(10.dp))

        JelloTextRegular(
            text = "Password",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        JelloEditText(
            visualTransformation = PasswordVisualTransformation()
        )

        JelloButtonPrimary(
            text = "Create account"
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignupScreenScreenPreview() {
    SignupScreen()
}
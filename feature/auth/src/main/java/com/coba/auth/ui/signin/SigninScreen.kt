package com.coba.auth.ui.signin

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
fun SigninScreen(
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

            }
        )

        Spacer(modifier = Modifier.height(30.dp))

        JelloTextHeader(
            text = "Welcome to Login",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        JelloTextRegularWithClick(
            text = "Please fill E-mail & password to login your app account.",
            textClick = " Sign Up",
            modifier = Modifier.padding(horizontal = 16.dp),
            onClick = {
                navController.navigate("signup")
            }

        )

        Spacer(modifier = Modifier.height(25.dp))

        JelloTextRegular(
            text = "E-mail",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        JelloEditText()

        JelloTextRegular(
            text = "Password",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        JelloEditText(
            visualTransformation = PasswordVisualTransformation()
        )

        JelloTextViewRow()

        JelloButtonPrimary()

        JelloButtonSosmedRow(
            onClickFacebook = {},
            onClickGoogle = {}
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SigninScreenPreview() {
    SigninScreen()
}
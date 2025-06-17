package com.coba.home.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    ScreenContent(title = "Home")
}

@Composable
fun ProductScreen() {
    ScreenContent(title = "Product")
}

@Composable
fun OrderScreen() {
    ScreenContent(title = "Order")
}

@Composable
fun AccountScreen() {
    ScreenContent(title = "Account")
}

@Composable
fun ScreenContent(title: String) {
    Column {
        Text(text = title)
    }
}
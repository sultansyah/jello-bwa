package com.coba.home.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.List
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ButtonNavItem(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {
    object Home : ButtonNavItem("home", "Home", Icons.Outlined.Home)
    object Product : ButtonNavItem("product", "Product", Icons.Outlined.ShoppingCart)
    object Order : ButtonNavItem("order", "Order", Icons.AutoMirrored.Outlined.List)
    object Account : ButtonNavItem("account", "Account", Icons.Outlined.Person)
}
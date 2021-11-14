package com.example.navgraphtest

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.thermalgapcalc_compose.presentation.navigation.NavigationRoute

@Composable
fun AddScreen(navHostController: NavHostController) {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "HistoryScreen")
        Button(onClick = {navHostController.navigate(NavigationRoute.ADDING)}) {
            Text(text = "Adding")
        }
    }
}
package com.example.navgraphtest

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.navgraphtest.ui.theme.NavGraphTestTheme
import com.example.thermalgapcalc_compose.presentation.navigation.NavigationComponent
import com.example.thermalgapcalc_compose.presentation.navigation.NavigationRoute

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navHostController = rememberNavController()
            NavGraphTestTheme {
                // A surface container using the 'background' color from the theme
                Surface() {
                    Column(Modifier.fillMaxSize()) {
                        NavigationComponent(navController = navHostController, Modifier.weight(1f))

                        Row(
                            Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            horizontalArrangement = SpaceBetween
                        ) {
                            Button(onClick = { navHostController.navigate(NavigationRoute.HISTORY_ROUTE) }) {
                                Text(text = "History")
                            }
                            Button(onClick = { navHostController.navigate(NavigationRoute.ADD_ROUTE) }) {
                                Text(text = "ADD")
                            }
                            Button(onClick = { navHostController.navigate(NavigationRoute.SETTINGS_ROUTE) }) {
                                Text(text = "History")
                            }
                        }
                    }
                }
            }
        }
    }
}


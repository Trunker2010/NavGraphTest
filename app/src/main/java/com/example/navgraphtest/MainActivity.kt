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
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavControllerVisibleEntries
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.navgraphtest.ui.theme.NavGraphTestTheme
import com.example.thermalgapcalc_compose.presentation.navigation.NavigationComponent
import com.example.thermalgapcalc_compose.presentation.navigation.NavigationRoute
import com.example.thermalgapcalc_compose.presentation.ui.bottom_navigation.BottomNavigationBar
import kotlinx.coroutines.flow.collect

class MainActivity : ComponentActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navHostController = rememberNavController()
            NavGraphTestTheme {
                // A surface container using the 'background' color from the theme
                Surface() {
                    navHostController
                    Scaffold(bottomBar = { BottomNavigationBar(navController = navHostController) }) {
                        Column(modifier = Modifier.fillMaxSize()) {
                            NavigationComponent(
                                navController = navHostController,
                                Modifier.weight(1f)
                            )
                        }
                    }
                }
            }
        }
    }

}


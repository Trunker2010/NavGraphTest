package com.example.thermalgapcalc_compose.presentation.ui.bottom_navigation

import android.util.Log
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavController) {
    val itemSList = listOf(
        NavigationItem.History,
        NavigationItem.Add,
        NavigationItem.Settings
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    BottomNavigation(
    ) {
        itemSList.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = navBackStackEntry?.destination?.parent?.route == item.route,
                onClick = {
                    if (!navBackStackEntry?.destination?.parent?.route.equals(item.route)) {
                        navController.navigate(item.route) {
                            navController.graph.findStartDestination().id.let {
                                popUpTo(it) {
                                    this.saveState = true

                                }
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            )
        }
    }
}
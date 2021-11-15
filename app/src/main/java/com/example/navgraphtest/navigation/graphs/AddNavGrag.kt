package com.example.thermalgapcalc_compose.presentation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navgraphtest.AddScreen
import com.example.navgraphtest.AddingScreen
import com.example.thermalgapcalc_compose.presentation.navigation.NavigationRoute

fun NavGraphBuilder.addNavGraph(navController: NavHostController) {
    navigation(
        startDestination = NavigationRoute.ADD,
        route = NavigationRoute.ADD_ROUTE
    ) {
        composable(route = NavigationRoute.ADD) {
            AddScreen( navHostController =navController)
        }
        composable(route = NavigationRoute.ADDING) {
            AddingScreen()
        }
    }
}
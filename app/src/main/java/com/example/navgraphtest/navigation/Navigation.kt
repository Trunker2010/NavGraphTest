package com.example.thermalgapcalc_compose.presentation.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.thermalgapcalc_compose.presentation.navigation.nav_graph.addNavGraph
import com.example.thermalgapcalc_compose.presentation.navigation.nav_graph.historyNavGraph
import com.example.thermalgapcalc_compose.presentation.navigation.nav_graph.settingsNavGraph


    @ExperimentalFoundationApi
    @RequiresApi(Build.VERSION_CODES.O)
    @Composable
    fun NavigationComponent(navController: NavHostController,modifier: Modifier) {
        NavHost(
            navController = navController,
            startDestination = NavigationRoute.HISTORY_ROUTE,
            modifier= modifier,
            route = NavigationRoute.ROOT_GRAPH_ROUTE
        ) {
            historyNavGraph(navController = navController)
            settingsNavGraph(navController = navController)
            addNavGraph(navController = navController)
        }
    }

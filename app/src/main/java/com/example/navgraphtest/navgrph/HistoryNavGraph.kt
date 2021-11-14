package com.example.thermalgapcalc_compose.presentation.navigation.nav_graph

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navgraphtest.HistoryScreen
import com.example.thermalgapcalc_compose.presentation.navigation.NavigationRoute

@ExperimentalFoundationApi
@RequiresApi(Build.VERSION_CODES.O)
fun NavGraphBuilder.historyNavGraph(navController: NavHostController) {

    navigation(
        startDestination = NavigationRoute.HISTORY,
        route = NavigationRoute.HISTORY_ROUTE
    ) {
        composable(route = NavigationRoute.HISTORY) {
            HistoryScreen()
        }
    }
}
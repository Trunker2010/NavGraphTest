package com.example.navgraphtest.bottom_navigation

import com.example.navgraphtest.R
import com.example.thermalgapcalc_compose.presentation.navigation.NavigationRoute


sealed class NavigationItem(var route: String, var icon: Int, var title: String) {

    object History : NavigationItem(NavigationRoute.HISTORY_ROUTE, R.drawable.ic_baseline_history_24, "История")
    object Add : NavigationItem(NavigationRoute.ADD_ROUTE, R.drawable.ic_baseline_add_box_24, "Создать")
    object Settings : NavigationItem(NavigationRoute.SETTINGS_ROUTE, R.drawable.ic_baseline_settings_24, "Настройки")
}
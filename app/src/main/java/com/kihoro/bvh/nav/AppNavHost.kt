package com.kihoro.bvh.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kihoro.bvh.ui.theme.screens.home.HomeScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier, navController: NavHostController= rememberNavController(),
               startDestination: String=ROUTE_HOME){
    NavHost(navController = navController,modifier = modifier,
        startDestination = startDestination) {
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }

    }
}
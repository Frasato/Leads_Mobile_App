package com.frasato.leadsapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.frasato.leadsapp.ui.create.CreateScreen
import com.frasato.leadsapp.ui.home.HomeScreen

@Composable
fun AppNavGraph(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.HOME
    ){
        composable(NavRoutes.HOME){
            HomeScreen(navController = navController)
        }
        composable(NavRoutes.CREATE){
            CreateScreen(navController = navController)
        }
    }
}
package com.frasato.leadsapp.ui.create

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.frasato.leadsapp.ui.components.BottomNavBar
import com.frasato.leadsapp.ui.navigation.NavRoutes

@Composable
fun CreateScreen(navController: NavController){
    Scaffold(
        bottomBar = {
            BottomNavBar(
                navController = navController,
                currentRoute = NavRoutes.CREATE
            )
        }
    ) { paddingValues ->
        Surface(
            modifier = Modifier.fillMaxSize().padding(paddingValues),
            color = Color(0xFF020617)
        ) {
            Text(text = "Form Page")
        }
    }
}
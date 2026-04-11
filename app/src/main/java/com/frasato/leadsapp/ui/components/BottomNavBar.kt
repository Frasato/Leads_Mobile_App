package com.frasato.leadsapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.frasato.leadsapp.data.model.BottomNavItem
import com.frasato.leadsapp.ui.navigation.NavRoutes

@Composable
fun BottomNavBar(
    navController: NavController,
    currentRoute: String?
) {
    NavigationBar(
        containerColor = Color(0xFF020617),
        contentColor = Color.White
    ) {
        val items = listOf(
            BottomNavItem(
                route = NavRoutes.HOME,
                icon = Icons.Outlined.Home,
                label = "Home"
            ),
            BottomNavItem(
                route = NavRoutes.CREATE,
                icon = Icons.Outlined.Add,
                label = "Create"
            )
        )

        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.label
                    )
                },
                label = { Text(item.label) },
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF60A5FA),
                    selectedTextColor = Color(0xFF60A5FA),
                    unselectedIconColor = Color.White.copy(alpha = 0.6f),
                    unselectedTextColor = Color.White.copy(alpha = 0.6f),
                    indicatorColor = Color(0xFF1E293B)
                )
            )
        }
    }
}
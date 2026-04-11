package com.frasato.leadsapp.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.frasato.leadsapp.ui.components.BottomNavBar
import com.frasato.leadsapp.ui.components.LeadCard
import com.frasato.leadsapp.ui.navigation.NavRoutes

@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel(), navController: NavController){
    val leads = viewModel.leads
    val loading = viewModel.isLoading

    LaunchedEffect(Unit) { viewModel.loadLeads() }

    Scaffold(
        bottomBar = {
            BottomNavBar(
                navController = navController,
                currentRoute = NavRoutes.HOME
            )
        }
    ){ paddingValues ->
        Surface(
            modifier = Modifier.fillMaxSize().padding(paddingValues = paddingValues),
            color = Color(0xFF020617)
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 35.dp, bottom = 15.dp)
            ) {
                if (loading) {
                    item {
                        Text(
                            text = "Carregando...",
                            color = Color.White,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
                items(leads) { lead -> LeadCard(lead) }
            }
        }
    }
}
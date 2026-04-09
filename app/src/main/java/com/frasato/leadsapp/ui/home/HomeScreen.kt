package com.frasato.leadsapp.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.frasato.leadsapp.ui.components.LeadCard

@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel()){
    val leads = viewModel.leads
    val loading = viewModel.isLoading

    LaunchedEffect(Unit) { viewModel.loadLeads() }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF020617)
    ) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
                .padding(0.dp, 35.dp, 0.dp, 15.dp)
        ) {
            if(loading){ Text("Carregando...") }
            leads.forEach { LeadCard(it) }
        }
    }
}
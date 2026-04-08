package com.frasato.leadsapp.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel()){
    val leads = viewModel.leads
    val loading = viewModel.isLoading

    LaunchedEffect(Unit) {
        viewModel.loadLeads()
    }

    Column() {
        if(loading){
            Text("Carregando...")
        }

        leads.forEach {
            Text(text = it.name)
        }
    }
}
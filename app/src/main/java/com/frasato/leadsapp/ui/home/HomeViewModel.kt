package com.frasato.leadsapp.ui.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.frasato.leadsapp.data.model.Lead
import com.frasato.leadsapp.data.repository.LeadRepository
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {

    private val repository = LeadRepository()

    var leads by mutableStateOf<List<Lead>>(emptyList())
    var isLoading by mutableStateOf(false)

    fun loadLeads(){
        viewModelScope.launch {
            isLoading = true

            try{
                leads = repository.getLeads()
            }catch(error: Exception){
                error.printStackTrace()
            }

            isLoading = false
        }
    }
}
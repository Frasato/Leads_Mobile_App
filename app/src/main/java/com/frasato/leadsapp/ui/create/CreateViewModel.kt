package com.frasato.leadsapp.ui.create

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.frasato.leadsapp.domain.usecase.LeadUseCase
import kotlinx.coroutines.launch

class CreateViewModel: ViewModel() {

    private val leadUseCase = LeadUseCase()

    fun createLead(name: String, phone: String, cpf: String, address: String, city: String, usedMedicine: String){
        viewModelScope.launch {
            try {
                leadUseCase.createLead(name, phone, address, cpf, city, usedMedicine)
            }catch (error: Exception){
                throw Exception(error.message);
            }
        }
    }

}
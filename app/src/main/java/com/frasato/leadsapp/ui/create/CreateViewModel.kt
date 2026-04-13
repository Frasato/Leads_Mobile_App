package com.frasato.leadsapp.ui.create

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.frasato.leadsapp.data.model.LeadRequest
import com.frasato.leadsapp.data.repository.LeadRepositoryImplementation
import com.frasato.leadsapp.domain.usecase.LeadUseCase
import kotlinx.coroutines.launch

class CreateViewModel: ViewModel() {

    private val leadUseCase = LeadUseCase(LeadRepositoryImplementation())

    fun createLead(name: String, phone: String, cpf: String, address: String, city: String, usedMedicine: String){
        viewModelScope.launch {
            try {
                val lead = LeadRequest(
                    name = name,
                    phone = phone,
                    address = address,
                    cpf = cpf,
                    city = city,
                    usedMedicine = usedMedicine
                )
                leadUseCase.createLead(lead)
            }catch (error: Exception){
                throw Exception(error.message);
            }
        }
    }

}
package com.frasato.leadsapp.domain.usecase

import com.frasato.leadsapp.data.model.Lead
import com.frasato.leadsapp.data.model.LeadRequest
import com.frasato.leadsapp.data.repository.LeadRepository

class LeadUseCase(
    private val repository: LeadRepository = LeadRepository()
) {
    suspend fun getLeads(): List<Lead>{
        return repository.getLeads()
    }

    suspend fun createLead(
        name: String,
        phone: String,
        address: String,
        cpf: String,
        city: String,
        usedMedicine: String,
        ){
        val lead = LeadRequest(
            name = name,
            phone = phone,
            address = address,
            cpf= cpf,
            city = city,
            usedMedicine = usedMedicine,
        )
    }
}
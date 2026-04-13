package com.frasato.leadsapp.domain.usecase

import com.frasato.leadsapp.data.model.Lead
import com.frasato.leadsapp.data.model.LeadRequest
import com.frasato.leadsapp.domain.repository.LeadRepository

class LeadUseCase(
    private val repository: LeadRepository
) {
    suspend fun getLeads(): List<Lead>{
        return repository.getLeads()
    }

    suspend fun createLead(lead: LeadRequest){
        repository.createLead(lead)
    }
}
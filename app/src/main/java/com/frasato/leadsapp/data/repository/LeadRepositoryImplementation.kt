package com.frasato.leadsapp.data.repository

import com.frasato.leadsapp.data.model.Lead
import com.frasato.leadsapp.data.model.LeadRequest
import com.frasato.leadsapp.data.remote.RetrofitInstance
import com.frasato.leadsapp.domain.repository.LeadRepository

class LeadRepositoryImplementation: LeadRepository {
    override suspend fun getLeads(): List<Lead>{
        return RetrofitInstance.api.getLeads();
    }

    override suspend fun createLead(lead: LeadRequest){
        RetrofitInstance.api.createLead(lead);
    }
}
package com.frasato.leadsapp.domain.repository

import com.frasato.leadsapp.data.model.Lead
import com.frasato.leadsapp.data.model.LeadRequest

interface LeadRepository {
    suspend fun getLeads(): List<Lead>
    suspend fun createLead(lead: LeadRequest)
}
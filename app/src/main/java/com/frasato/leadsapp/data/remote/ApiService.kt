package com.frasato.leadsapp.data.remote

import com.frasato.leadsapp.data.model.Lead
import com.frasato.leadsapp.data.model.LeadRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("api/leads")
    suspend fun getLeads(): List<Lead>

    @POST("api/leads")
    suspend fun createLead(@Body lead: LeadRequest)
}
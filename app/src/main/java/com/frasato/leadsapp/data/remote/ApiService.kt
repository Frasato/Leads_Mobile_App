package com.frasato.leadsapp.data.remote

import com.frasato.leadsapp.data.model.Lead
import retrofit2.http.GET

interface ApiService {
    @GET("api/leads")
    suspend fun getLeads(): List<Lead>
}
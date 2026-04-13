package com.frasato.leadsapp.data.model

data class Lead(
    val id: Int,
    val name: String,
    val phone: String,
    val address: String,
    val cpf: String,
    val city: String,
    val usedMedicine: String,
)

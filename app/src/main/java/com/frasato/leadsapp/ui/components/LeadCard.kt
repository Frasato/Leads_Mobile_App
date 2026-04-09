package com.frasato.leadsapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.frasato.leadsapp.data.model.Lead

@Composable
fun LeadCard(lead: Lead) {

    val backgroundColor = Color(0xFF0F172A)
    val borderColor = Color(0xFF1E293B)
    val labelColor = Color(0xFF64748B)
    val valueColor = Color.White

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .border(1.dp, borderColor, RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row {
                Icon(
                    imageVector = Icons.Outlined.Person,
                    contentDescription = null,
                    tint = Color(0xFF38BDF8)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = lead.name,
                    color = valueColor,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            InfoItem(
                icon = Icons.Outlined.Phone,
                label = "TELEFONE",
                value = lead.phone,
                labelColor = labelColor,
                valueColor = valueColor
            )

            InfoItem(
                icon = Icons.Outlined.Info,
                label = "CPF",
                value = lead.cpf,
                labelColor = labelColor,
                valueColor = valueColor
            )

            InfoItem(
                icon = Icons.Outlined.LocationOn,
                label = "ENDEREÇO",
                value = lead.address,
                labelColor = labelColor,
                valueColor = valueColor
            )

            InfoItem(
                icon = Icons.Outlined.LocationOn,
                label = "CIDADE",
                value = lead.city,
                labelColor = labelColor,
                valueColor = valueColor
            )
        }
    }
}
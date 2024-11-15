package com.example.bienvenidoalcurso

import android.graphics.Color.rgb
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bienvenidoalcurso.ui.theme.BienvenidoAlCursoTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                BusinessCard()
            }
        }

    }
}

@Composable
fun BusinessCard() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(rgb(255, 210, 210))), // Color de fondo verde claro
        color = Color.Transparent
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.reservar_usuario), // Reemplaza con el recurso de imagen correspondiente
                contentDescription = "Logo de Android",
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))


            Text(
                text = "Sebastian López",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            // Cargo o descripción
            Text(
                text = "Android Student",
                fontSize = 16.sp,
                color = Color(rgb(138, 0, 0)), // Color verde oscuro
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(500.dp))

            // Sección de contacto
            Column(
                horizontalAlignment = Alignment.CenterHorizontally, // Cambiado para centrar horizontalmente
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                ContactInfoRow(
                    icon = Icons.Default.Phone,
                    contactText = "+51 940 626 677"
                )
                Spacer(modifier = Modifier.height(8.dp))
                ContactInfoRow(
                    icon = Icons.Default.Share, // Icono de Material Design para redes sociales
                    contactText = "@Bionuir"
                )
                Spacer(modifier = Modifier.height(8.dp))
                ContactInfoRow(
                    icon = Icons.Default.Email,
                    contactText = "sebastian.lopez.c@tecsup.edu.pe"
                )
            }

        }
    }
}

@Composable
fun ContactInfoRow(icon: androidx.compose.ui.graphics.vector.ImageVector, contactText: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(rgb(138, 0, 0)), // Color verde oscuro
            modifier = Modifier.size(24.dp),
        )
        Spacer(modifier = Modifier.width(15.dp))
        Text(
            text = contactText,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCard()
}
package es.fpsumma.dam2.myapplication.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import es.fpsumma.dam2.myapplication.ui.navigation.Routes

// ui/screens/home/HomeScreen.kt

@Composable
fun HomeScreen(navController: NavController) {

    Column {
        Text("Hola, usuario!",
            modifier = Modifier.padding(top = 50.dp))
        Text("Esta es tu pantalla de inicio. Desde aquí puedes acceder a diferentes secciones.",
            modifier = Modifier.padding(top = 30.dp))

        Card {
            Text("¿Sabías qué...?",
                fontWeight = FontWeight.Bold)
            Text("Puedes navegar entre pantallas usando el NavController en Compose. ¡Explora abajo!",
                modifier = Modifier.padding(top = 30.dp).padding(start = 30.dp).padding(end = 30.dp))
        }

        Button(
            onClick = { navController.navigate(Routes.EDITPROFILE) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ver perfil")
        }

        Button(
            onClick = { navController.navigate(Routes.EDITPROFILE) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Configuración")
        }

    }
}
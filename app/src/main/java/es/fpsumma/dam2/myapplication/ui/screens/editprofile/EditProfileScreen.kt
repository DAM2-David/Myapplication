package es.fpsumma.dam2.myapplication.ui.screens.editprofile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import es.fpsumma.dam2.myapplication.ui.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditProfileScreen(navController: NavController) {

    var nombreCompleto by remember { mutableStateOf("")}
    var profesión by remember { mutableStateOf("")}
    var correoElectrónico by remember { mutableStateOf("")}
    var teléfono by remember { mutableStateOf("")}
    var ubicación by remember { mutableStateOf("")}
    var formaciónAcadémica by remember { mutableStateOf("")}


    Column {
        Row {
            TextButton(
                onClick =
                    { navController.navigate(Routes.PROFILE) } )
            {
                Text("<-",
                    modifier = Modifier.padding(top = 50.dp))
            }
        }
    }

    Column (modifier = Modifier.padding(top = 100.dp).padding(start = 30.dp).padding(end = 30.dp)
    ){


        OutlinedTextField(
            value = nombreCompleto,
            onValueChange = { nuevoTexto -> nombreCompleto = nuevoTexto },
            label = { Text("Nombre Completo") }
        )

        OutlinedTextField(
            value = profesión,
            onValueChange = { nuevoTexto -> profesión = nuevoTexto },
            label = { Text("Profesión") }
        )

        OutlinedTextField(
            value = correoElectrónico,
            onValueChange = { nuevoTexto -> correoElectrónico = nuevoTexto },
            label = { Text("Correo electrónico") }
        )

        OutlinedTextField(
            value = teléfono,
            onValueChange = { nuevoTexto -> teléfono = nuevoTexto },
            label = { Text("Teléfono") }
        )

        OutlinedTextField(
            value = ubicación,
            onValueChange = { nuevoTexto -> ubicación = nuevoTexto },
            label = { Text("Ubicación") }
        )

        OutlinedTextField(
            value = formaciónAcadémica,
            onValueChange = { nuevoTexto -> formaciónAcadémica = nuevoTexto },
            label = { Text("Formación Académica") }
        )


        Button(
            onClick = { navController.navigate(Routes.PROFILE) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Guardar cambios")
        }

    }

}
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
import es.fpsumma.dam2.myapplication.state.ProfileState.correo
import es.fpsumma.dam2.myapplication.state.ProfileState.formacion
import es.fpsumma.dam2.myapplication.state.ProfileState.nombre
import es.fpsumma.dam2.myapplication.state.ProfileState.profesion
import es.fpsumma.dam2.myapplication.state.ProfileState.telefono
import es.fpsumma.dam2.myapplication.state.ProfileState.ubicacion
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
                Text("<- Editar Perfil",
                    modifier = Modifier.padding(top = 50.dp))
            }
        }
    }

    Column (modifier = Modifier.padding(top = 100.dp).padding(start = 30.dp).fillMaxWidth().padding(end=30.dp)
    ){


        OutlinedTextField(
            value = nombre,
            onValueChange = { nuevoTexto -> nombre = nuevoTexto },
            label = { Text("Nombre Completo") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = profesion,
            onValueChange = { nuevoTexto -> profesion = nuevoTexto },
            label = { Text("Profesión") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = correo,
            onValueChange = { nuevoTexto -> correo = nuevoTexto },
            label = { Text("Correo electrónico") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = telefono,
            onValueChange = { nuevoTexto -> telefono = nuevoTexto },
            label = { Text("Teléfono") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = ubicacion,
            onValueChange = { nuevoTexto -> ubicacion = nuevoTexto },
            label = { Text("Ubicación") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = formacion,
            onValueChange = { nuevoTexto -> formacion = nuevoTexto },
            label = { Text("Formación Académica") },
            modifier = Modifier.fillMaxWidth()
        )


        Button(
            onClick = { navController.navigate(Routes.PROFILE) },
            modifier = Modifier.fillMaxWidth().padding(top = 30.dp).padding(start = 180.dp)
        ) {
            Text("Guardar cambios")
        }

    }

}
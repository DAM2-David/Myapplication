package es.fpsumma.dam2.myapplication.ui.screens.viewprofile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import es.fpsumma.dam2.myapplication.ui.navigation.Routes
import es.fpsumma.dam2.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewProfileScreen(navController: NavController) {

    Column(modifier = Modifier.padding(top=30.dp)) {
        Column (modifier = Modifier.padding(top = 30.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally){

            Text("Juan Pérez")
            Text("Desarrollador Android")

            Row {
                Text("Correo")
                Text("hola@gmail.com")
            }
            Row{
                Text("Telefono")
                Text("685678122")
            }
            Row{
                Text("Ubicación")
                Text("Madrid, España")
            }

            Row{
                Text("Formación")
                Text("Grado Superior Informática")
            }
        }


    Button(
        onClick = { navController.navigate(Routes.EDITPROFILE) },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Editar perfil")
    }

    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    val navController = rememberNavController()
    MyApplicationTheme {
        ViewProfileScreen(navController)
    }
}
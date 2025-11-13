package es.fpsumma.dam2.myapplication.ui.screens.viewprofile

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import es.fpsumma.dam2.myapplication.R
import es.fpsumma.dam2.myapplication.state.ProfileState.correo
import es.fpsumma.dam2.myapplication.state.ProfileState.formacion
import es.fpsumma.dam2.myapplication.state.ProfileState.nombre
import es.fpsumma.dam2.myapplication.state.ProfileState.profesion
import es.fpsumma.dam2.myapplication.state.ProfileState.telefono
import es.fpsumma.dam2.myapplication.state.ProfileState.ubicacion
import es.fpsumma.dam2.myapplication.ui.navigation.Routes
import es.fpsumma.dam2.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewProfileScreen(navController: NavController) {

    Column(modifier = Modifier.padding(top=30.dp)) {
        Column (modifier = Modifier.padding(top = 80.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally){

            Image(
                painter = painterResource(id = R.drawable.avatar), // <-- Aquí cargas tu imagen
                contentDescription = "Foto de perfil",
                contentScale = ContentScale.Crop, // Para que la imagen se ajuste y corte si es necesario
                modifier = Modifier
                    .size(100.dp) // Tamaño de la imagen (ajusta según necesites)
                    .clip(CircleShape) // Recorta la imagen en un círculo
                    .border(2.dp, Color.Gray, CircleShape) // Opcional: un borde gris
            )

            Text(nombre)
            Text(profesion)
        }
        Column (modifier = Modifier
            .padding(top = 30.dp)
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
        ){
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text("✉\uFE0F Correo")
                Text(correo)
            }

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text("\uD83D\uDCF1 Telefono")
                Text(telefono)
            }

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text("\uD83D\uDCCD Ubicación")
                Text(ubicacion)
            }

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text("\uD83D\uDC68\u200D\uD83C\uDF93 Formación")
                Text(formacion)
            }
        }


        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { navController.navigate(Routes.EDITPROFILE) },
                modifier = Modifier.padding(top = 30.dp)
            ) {
                Text(text = "Editar perfil")
            }
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
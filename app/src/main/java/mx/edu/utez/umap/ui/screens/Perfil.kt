package mx.edu.utez.umap.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Perfil (){
    var usuario by remember { mutableStateOf("") }
    var contraseña by remember { mutableStateOf("") }
    var mensaje by remember { mutableStateOf("") }


    val contra = "1234"
    val user = "Alan"

    Column (
        modifier = Modifier.fillMaxSize().statusBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text(text = "ADMINISTRADOR")
        Text(text = "Inicia sesion")

        OutlinedTextField(
            value = usuario,
            onValueChange = {usuario = it},
            label = {Text(text = "Usuario")}
        )

        OutlinedTextField(
            value = contraseña,
            onValueChange = {contraseña = it},
            label = {Text(text = "Contraseña")}
        )

        Button(onClick = {
            mensaje = "intenta de nuevo"

            if (contraseña == contra && usuario == user) {
                mensaje = "Bienvenido"
            }

        }) {
            Text(text = "Iniciar sesion")
        }
        Text(text = mensaje)
    }
}
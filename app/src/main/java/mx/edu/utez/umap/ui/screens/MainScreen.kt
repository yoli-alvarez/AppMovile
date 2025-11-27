package mx.edu.utez.umap.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


@Composable
fun MainScreen() {
    var seleccionado by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomAppBar {
                NavigationBarItem(
                    selected = seleccionado == 0,
                    onClick = {seleccionado = 0},
                    icon = { Icon(
                        Icons.Default.Search,
                        contentDescription = "Mapa"
                    ) }

                )
                NavigationBarItem(
                    selected = seleccionado == 1,
                    onClick = {seleccionado = 1},
                    icon = { Icon(
                        Icons.Default.Favorite,
                        contentDescription = "Favoritos"
                    ) }

                )
                NavigationBarItem(
                    selected = seleccionado == 2,
                    onClick = {seleccionado = 2},
                    icon = { Icon(
                        Icons.Default.Person,
                        contentDescription = "Perfil"
                    ) }

                )

            }
        },
        content = { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding))
            when (seleccionado) {

                0 -> Mapa()
                1 -> Favoritos()
                2 -> Perfil()
            }
        }
    )
}
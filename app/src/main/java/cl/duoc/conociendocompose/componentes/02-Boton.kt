package cl.duoc.conociendocompose.componentes

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun Boton() {
    Button(
        onClick = {
            println("Click")
        }) {
        Text("Clickeame")
    }
}
package cl.duoc.conociendocompose.componentes

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun Boton() {
    Button(
        onClick = {
            println("Click")
        }) {
        Text("Clickeame")
    }
}
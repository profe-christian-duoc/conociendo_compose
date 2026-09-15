package cl.duoc.conociendocompose.componentes

import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun InputText() {
    OutlinedTextField(
        value = "texto",
        onValueChange = {
            println("Escribiendo")
        },
        label = {
            Text("Otro texto")
        }
    )
}
package cl.duoc.conociendocompose.componentes

import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun InputText() {
    var nombre by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = nombre,
        onValueChange = {
            nombre = it
        }
    )
}
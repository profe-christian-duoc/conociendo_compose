package cl.duoc.conociendocompose.componentes

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun CajaCheck() {
    var acepta by remember {
        mutableStateOf(false)
    }
    Checkbox(
        checked = acepta,
        onCheckedChange = {
            acepta = it
        }
    )
}
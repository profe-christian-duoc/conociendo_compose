package cl.duoc.conociendocompose.componentes

import androidx.compose.material3.Switch
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Interruptor() {
    var notificaciones by remember {
        mutableStateOf(false)
    }
    Switch(
        checked = notificaciones,
        onCheckedChange = {
            notificaciones = it
        }
    )
}
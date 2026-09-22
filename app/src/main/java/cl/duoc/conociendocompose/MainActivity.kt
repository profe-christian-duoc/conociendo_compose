package cl.duoc.conociendocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cl.duoc.conociendocompose.registro.Formulario
import cl.duoc.conociendocompose.registro.Navegacion
import cl.duoc.conociendocompose.ui.theme.ConociendoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConociendoComposeTheme() {
                Navegacion()
            }
        }
    }
}

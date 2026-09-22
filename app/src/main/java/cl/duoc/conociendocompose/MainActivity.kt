package cl.duoc.conociendocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import cl.duoc.conociendocompose.act01_registro.Navegacion
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

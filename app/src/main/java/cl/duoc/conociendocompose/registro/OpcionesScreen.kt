package cl.duoc.conociendocompose.registro

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OpcionesScreen(
    onIrARegistro: () -> Unit,
    onIrAInicio: () -> Unit
) {


    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text("Opciones")

            Button(
                onClick = {
                    onIrARegistro()
                }
            ) {
                Text("Registrar persona")
            }

            Button(
                onClick = {
                    onIrAInicio()
                }
            ) {
                Text("Ir a inicio")
            }
        }
    }
}

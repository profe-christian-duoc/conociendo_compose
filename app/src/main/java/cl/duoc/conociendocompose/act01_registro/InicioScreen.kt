package cl.duoc.conociendocompose.act01_registro

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

@Composable
fun InicioScreen(
    onIrARegistro: () -> Unit,
    onIrAOpciones: () -> Unit
) {


    Scaffold { innerPadding ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {

            Text("Aplicación de registro")

            Button(
                onClick = {
                    onIrARegistro()
                }
            ) {
                Text("Registrar persona")
            }

            Button(
                onClick = {
                    onIrAOpciones()
                }
            ) {
                Text("Ir a opciones")
            }
        }
    }
}
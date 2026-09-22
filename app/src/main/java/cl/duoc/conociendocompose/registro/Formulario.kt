package cl.duoc.conociendocompose.registro

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Formulario(modifier: Modifier = Modifier) {

    var nombre by remember {
        mutableStateOf("")
    }

    var apellido by remember {
        mutableStateOf("")
    }

    var correo by remember {
        mutableStateOf("")
    }

    var esEstudiante by remember {
        mutableStateOf(false)
    }

    var aceptaTerminos by remember {
        mutableStateOf(false)
    }
    Scaffold() { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Text("Formulario de registro", fontSize = 27.sp)
            //Text(text = "Formulario de registro", style = MaterialTheme.typography.headlineMedium)


            OutlinedTextField(
                value = nombre,
                onValueChange = {
                    nombre = it
                },
                label = {
                    Text("Nombre")
                },
                modifier = Modifier.fillMaxWidth()
            )

            OutlinedTextField(
                value = apellido,
                onValueChange = {
                    apellido = it
                },
                label = {
                    Text("Apellido")
                },
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedTextField(
                value = correo,
                onValueChange = {
                    correo = it
                },
                label = {
                    Text("Correo")
                },
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text("¿Es estudiante?")

                Switch(
                    checked = esEstudiante,
                    onCheckedChange = {
                        esEstudiante = it
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Checkbox(
                    checked = aceptaTerminos,
                    onCheckedChange = {
                        aceptaTerminos = it
                    }
                )
                Text("Acepto los términos y condiciones")
            }
            Button(
                onClick = {

                    println("***** REGISTRO *****")
                    println("Nombre: $nombre")
                    println("Apellido: $apellido")
                    println("Correo: $correo")
                    println("Es estudiante: $esEstudiante")
                    println("Acepta términos: $aceptaTerminos")

                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Registrarse")
            }
        }
    }
}
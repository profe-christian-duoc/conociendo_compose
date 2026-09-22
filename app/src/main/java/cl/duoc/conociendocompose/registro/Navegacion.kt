package cl.duoc.conociendocompose.registro

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "inicio"
    ) {
        composable("inicio") {
            InicioScreen(
                onIrARegistro = {
                    navController.navigate("registro")
                },
                onIrAOpciones = {
                    navController.navigate("opciones")
                }
            )
        }
        composable("registro") {
            Formulario()
        }
        composable("opciones") {
            OpcionesScreen(
                onIrARegistro = {
                    navController.navigate("registro")
                },
                onIrAInicio = {
                    navController.navigate("inicio")
                }
            )
        }
    }
}
package cl.duoc.conociendocompose.componentes


import androidx.compose.foundation.Image
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import cl.duoc.conociendocompose.R

@Preview
@Composable
fun Imagen() {
    Image(
        painter = painterResource(R.drawable.duoc_logo),
        contentDescription = "Logo de Duoc"
    )
}
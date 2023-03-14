package com.example.material_design_3_in_compose

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.material_design_3_in_compose.ui.theme.MaterialDesign3inComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialDesign3inComposeTheme {
                ColorBox()
            }
        }
    }
}

@Preview(name = "Dark Mode", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun ColorBoxDark(){
    MaterialDesign3inComposeTheme(darkTheme = true) {
        ColorBox()
    }
}


@Preview(name = "Light Mode")
@Composable
fun ColorBoxLight(){
    MaterialDesign3inComposeTheme(darkTheme = false) {
        ColorBox()
    }
}

@Composable
fun ColorBox() {

        Column(Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Primary Color",
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.onPrimary),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "On Primary Color",
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.secondary),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Secondary Color",
                    color = MaterialTheme.colorScheme.onSecondary,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.onSecondary),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "On Secondary Color",
                    color = MaterialTheme.colorScheme.secondary,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.background),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Background Color",
                    color = MaterialTheme.colorScheme.onBackground,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.onBackground),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "On Background Color",
                    color = MaterialTheme.colorScheme.background,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.surface),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Surface Color",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.onSurface),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "On Surface Color",
                    color = MaterialTheme.colorScheme.surface,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.error),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Error Color",
                    color = MaterialTheme.colorScheme.onError,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.onError),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "On Error Color",
                    color = MaterialTheme.colorScheme.error,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.onPrimaryContainer),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "On Primary Container Color",
                    color = MaterialTheme.colorScheme.primaryContainer,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.primaryContainer),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Primary Container Color",
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.onSecondaryContainer),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "On Secondary Container Color",
                    color = MaterialTheme.colorScheme.secondaryContainer,
                    fontSize = 14.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.secondaryContainer),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Secondary Container Color",
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                    fontSize = 14.sp
                )
            }

        }

}
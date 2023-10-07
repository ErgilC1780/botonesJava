package com.example.creandobotones

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.UiMode
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.creandobotones.components.BotonIcono
import com.example.creandobotones.components.BotonNormal
import com.example.creandobotones.components.BotonNormal2
import com.example.creandobotones.components.BotonOutline
import com.example.creandobotones.components.BotonSwitch
import com.example.creandobotones.components.BotonTexto
import com.example.creandobotones.components.DarkMode
import com.example.creandobotones.components.FloatingAction
import com.example.creandobotones.components.Space
import com.example.creandobotones.ui.theme.CreandoBotonesTheme
import androidx.compose.material3.Surface as Surface1

@Composable
fun Content (darkMode: MutableState<Boolean>){
    Column {
        var modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
        var horizontalAlignment = Alignment.CenterHorizontally
        run {
            BotonNormal()
            Space()
            BotonNormal2()
            Space()
            BotonTexto()
            Space()
            BotonOutline()
            Space()
            BotonIcono()
            Space()
            BotonIcono()
            Space()
            BotonSwitch()
            Space()
            DarkMode(darkMode = darkMode)
            Space()
            FloatingAction()
        }
    }
}



class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember { mutableStateOf(false ) }
            CreandoBotonesTheme(darkTheme = darkMode.value) {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    Content(darkMode)

            }
            }
        }
    }
}
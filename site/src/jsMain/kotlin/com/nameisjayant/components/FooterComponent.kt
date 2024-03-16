package com.nameisjayant.components

import androidx.compose.runtime.Composable
import com.nameisjayant.ui.footer_background
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text


@Composable
fun FooterComponent() {

    Box(
        modifier = Modifier.background(footer_background)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            H5 {
                Text("Jayant Kumar")
            }
            P {
                Text("Designed with love, and rights reserved for Jayant Kumar ")
            }
        }
    }

}
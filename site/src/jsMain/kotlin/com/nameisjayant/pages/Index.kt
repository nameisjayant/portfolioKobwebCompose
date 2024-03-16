package com.nameisjayant.pages

import androidx.compose.runtime.Composable
import com.nameisjayant.components.FooterComponent
import com.nameisjayant.components.HeaderComponent
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    Box(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
           Column(
               modifier = Modifier.fillMaxWidth().weight(1f)
           ) {
               HeaderComponent()
           }
            FooterComponent()
        }
    }
}

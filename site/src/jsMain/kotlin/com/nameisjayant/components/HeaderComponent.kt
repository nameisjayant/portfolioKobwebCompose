package com.nameisjayant.components

import androidx.compose.runtime.Composable
import com.nameisjayant.utils.Constant
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backdropFilter
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text


@Composable
fun HeaderComponent() {

    Row(
        modifier = Modifier.padding(leftRight = 4.cssRem).fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        H2(
            attrs = Modifier.weight(1f).toAttrs()
        ) {
            Text(Constant.PORTFOLIO)
        }
        NavHeader()
    }
}

@Composable
fun NavHeader(
    modifier: Modifier = Modifier
) {
    Row(
        NavHeaderStyle.toModifier().then(modifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                Modifier.gap(1.5.cssRem).displayIfAtLeast(Breakpoint.MD),
                verticalAlignment = Alignment.CenterVertically
            ) {
                MenuItems()
            }
        }
    }
}

@Composable
private fun MenuItems() {
    NavLink("#home", "Home")
    NavLink("#about", "About")
    NavLink("#project", "Project")
    NavLink("#contacts", "Contacts")
}

@Composable
private fun NavLink(path: String, text: String) {
    Link(path, text, variant = UndecoratedLinkVariant.then(UncoloredLinkVariant))
}

val NavHeaderStyle by ComponentStyle.base {
    Modifier.padding(1.cssRem).backdropFilter(blur(4.px))
        .styleModifier {
            property("-webkit-backdrop-filter", "blur( 4px )")
        }
}
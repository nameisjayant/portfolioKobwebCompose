package com.nameisjayant.ui

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.color


@InitSilk
fun initTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.light.background = backgroundColor
    ctx.theme.palettes.dark.background = backgroundColor
    ctx.theme.palettes.dark.color = Color.rgb(0Xffffff)
    ctx.theme.palettes.light.color = Color.rgb(0Xffffff)
}
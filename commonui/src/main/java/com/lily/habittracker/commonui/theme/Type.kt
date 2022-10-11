package com.lily.habittracker.commonui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.lily.habittracker.commonui.R

// Set of Material typography styles to start with

val klasikFontFamily = FontFamily(
    Font(R.font.klasik)
)

val manropeFontFamily = FontFamily(
    Font(R.font.manrope)
)

val Typography = Typography(

    h1 = TextStyle(fontFamily = klasikFontFamily),
    h2 = TextStyle(fontFamily = klasikFontFamily),
    h3 = TextStyle(fontFamily = klasikFontFamily),
    h4 = TextStyle(fontFamily = klasikFontFamily),
    h5 = TextStyle(fontFamily = klasikFontFamily),
    h6 = TextStyle(fontFamily = klasikFontFamily),
    subtitle1 = TextStyle(fontFamily = manropeFontFamily),
    subtitle2 = TextStyle(fontFamily = manropeFontFamily),
    body1 = TextStyle(fontFamily = manropeFontFamily),
    body2 = TextStyle(fontFamily = manropeFontFamily),
    button = TextStyle(fontFamily = manropeFontFamily),
    caption = TextStyle(fontFamily = manropeFontFamily),
    overline = TextStyle(fontFamily = manropeFontFamily),

    /* Other default text styles to override
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
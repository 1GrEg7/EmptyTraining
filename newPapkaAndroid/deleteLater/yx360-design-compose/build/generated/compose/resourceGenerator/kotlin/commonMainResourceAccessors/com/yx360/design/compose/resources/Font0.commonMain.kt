@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package com.yx360.design.compose.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.FontResource
import org.jetbrains.compose.resources.InternalResourceApi

private object CommonMainFont0 {
  public val ys_display_360: FontResource by 
      lazy { init_ys_display_360() }

  public val ys_text_bold: FontResource by 
      lazy { init_ys_text_bold() }

  public val ys_text_medium: FontResource by 
      lazy { init_ys_text_medium() }

  public val ys_text_regular: FontResource by 
      lazy { init_ys_text_regular() }
}

@InternalResourceApi
internal fun _collectCommonMainFont0Resources(map: MutableMap<String, FontResource>) {
  map.put("ys_display_360", CommonMainFont0.ys_display_360)
  map.put("ys_text_bold", CommonMainFont0.ys_text_bold)
  map.put("ys_text_medium", CommonMainFont0.ys_text_medium)
  map.put("ys_text_regular", CommonMainFont0.ys_text_regular)
}

public val Res.font.ys_display_360: FontResource
  get() = CommonMainFont0.ys_display_360

private fun init_ys_display_360(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:ys_display_360",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.yx360.design.compose.resources/font/ys_display_360.ttf", -1, -1),
    )
)

public val Res.font.ys_text_bold: FontResource
  get() = CommonMainFont0.ys_text_bold

private fun init_ys_text_bold(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:ys_text_bold",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.yx360.design.compose.resources/font/ys_text_bold.ttf", -1, -1),
    )
)

public val Res.font.ys_text_medium: FontResource
  get() = CommonMainFont0.ys_text_medium

private fun init_ys_text_medium(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:ys_text_medium",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.yx360.design.compose.resources/font/ys_text_medium.ttf", -1, -1),
    )
)

public val Res.font.ys_text_regular: FontResource
  get() = CommonMainFont0.ys_text_regular

private fun init_ys_text_regular(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:ys_text_regular",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.yx360.design.compose.resources/font/ys_text_regular.ttf", -1, -1),
    )
)

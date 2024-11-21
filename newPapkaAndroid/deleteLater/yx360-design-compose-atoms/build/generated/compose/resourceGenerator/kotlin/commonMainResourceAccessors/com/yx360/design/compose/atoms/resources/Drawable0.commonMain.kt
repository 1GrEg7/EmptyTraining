@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package com.yx360.design.compose.atoms.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi

private object CommonMainDrawable0 {
  public val default_avatar: DrawableResource by 
      lazy { init_default_avatar() }

  public val progress_bar_shadow: DrawableResource by 
      lazy { init_progress_bar_shadow() }
}

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("default_avatar", CommonMainDrawable0.default_avatar)
  map.put("progress_bar_shadow", CommonMainDrawable0.progress_bar_shadow)
}

public val Res.drawable.default_avatar: DrawableResource
  get() = CommonMainDrawable0.default_avatar

private fun init_default_avatar(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:default_avatar",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.yx360.design.compose.atoms.resources/drawable/default_avatar.png", -1, -1),
    )
)

public val Res.drawable.progress_bar_shadow: DrawableResource
  get() = CommonMainDrawable0.progress_bar_shadow

private fun init_progress_bar_shadow(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:progress_bar_shadow",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.yx360.design.compose.atoms.resources/drawable/progress_bar_shadow.png", -1, -1),
    )
)

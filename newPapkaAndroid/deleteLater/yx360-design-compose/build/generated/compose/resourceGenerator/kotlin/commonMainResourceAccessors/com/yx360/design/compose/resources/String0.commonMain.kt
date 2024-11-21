@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package com.yx360.design.compose.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.StringResource

private object CommonMainString0 {
  public val atoms_group_more_title: StringResource by 
      lazy { init_atoms_group_more_title() }
}

@InternalResourceApi
internal fun _collectCommonMainString0Resources(map: MutableMap<String, StringResource>) {
  map.put("atoms_group_more_title", CommonMainString0.atoms_group_more_title)
}

public val Res.string.atoms_group_more_title: StringResource
  get() = CommonMainString0.atoms_group_more_title

private fun init_atoms_group_more_title(): StringResource =
    org.jetbrains.compose.resources.StringResource(
  "string:atoms_group_more_title", "atoms_group_more_title",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.yx360.design.compose.resources/values/strings.commonMain.cvr", 10, 46),
    )
)

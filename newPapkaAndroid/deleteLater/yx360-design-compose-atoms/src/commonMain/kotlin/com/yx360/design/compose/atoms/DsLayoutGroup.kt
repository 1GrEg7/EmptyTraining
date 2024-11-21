package com.yx360.design.compose.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom

/**
 * Figma [https://nda.ya.ru/t/QqSTF8Uh77jjyd]
 */
@ExperimentalOrbitaDsAtom
@Composable
fun DsLayoutGroup(
    modifier: Modifier = Modifier,
    paddingHorizontal: Dp = 0.dp,
    paddingVertical: Dp = 0.dp,
    content: @Composable ColumnScope.() -> Unit,
) = DsLayoutGroup(
    modifier = modifier,
    paddingHorizontal = paddingHorizontal,
    paddingVertical = paddingVertical,
    content = listOf(content),
)

/**
 * Figma [https://nda.ya.ru/t/QqSTF8Uh77jjyd]
 */
@ExperimentalOrbitaDsAtom
@Composable
fun DsLayoutGroup(
    modifier: Modifier = Modifier,
    paddingHorizontal: Dp = 0.dp,
    paddingVertical: Dp = 0.dp,
    content: List<@Composable ColumnScope.() -> Unit>,
) {
    Column(
        modifier = modifier
            .background(
                color = Ds.Color.SurfaceGeneric,
                shape = RoundedCornerShape(Ds.Rounding.M8),
            ),
        content = {
            content.forEachIndexed { index, contentItem ->
                Column(
                    modifier = Modifier
                        .padding(
                            horizontal = paddingHorizontal,
                            vertical = paddingVertical,
                        ),
                    content = contentItem,
                )

                if (index != content.lastIndex) {
                    DsDivider(compact = false)
                }
            }
        },
    )
}

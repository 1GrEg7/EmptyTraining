package com.yx360.design.compose.atoms

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.DsDrawable
import com.yx360.design.compose.atoms.utils.ExperimentalOrbitaDsAtom

/**
 * [Figma](https://nda.ya.ru/t/NWrUgwTH78T4Dv)
 */
@Suppress("LongMethod", "MagicNumber")
@ExperimentalOrbitaDsAtom
@Composable
fun DsProgressBar(
    progress: Float,
    color: Color = Ds.BrandColor.SurfaceBrand,
    modifier: Modifier = Modifier,
    label: DsProgressBar.Label? = null,
) {
    require(progress in (0.0..1.0)) { "progress must be in range [0.0, 1.0], but value is $progress" }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(Ds.Spacing.M4)
    ) {
        Box(
            modifier = Modifier
                .height(6.dp)
                .background(color = Ds.Color.SurfaceGeneric, shape = CircleShape)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = DsDrawable.atomsProgressBarShadow(),
                contentScale = ContentScale.FillBounds,
                contentDescription = null
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(fraction = progress)
                    .clip(RoundedCornerShape(Ds.Rounding.M16))
                    .background(color)
            )
        }
        label?.let {
            Text(
                text = it.text,
                maxLines = it.maxLines,
                style = Ds.Typography.BodyShortMdMedium,
                color = Ds.Color.TextSecondary,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

object DsProgressBar {

    @Immutable
    class Label(
        val text: String,
        val maxLines: Int = 1
    )
}

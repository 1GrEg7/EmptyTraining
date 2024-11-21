package com.yx360.design.compose.atoms

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yx360.design.compose.Ds
import com.yx360.design.compose.atoms.preview.DrawForLightAndDarkTheme
import com.yx360.design.compose.atoms.preview.DrawRtl

@Preview
@Composable
fun DsSkeletonPreview() {
    DrawForLightAndDarkTheme {
        DsSkeletons()
    }
}

@Preview
@Composable
fun DsSkeletonPreviewRtl() {
    DrawRtl {
        DsSkeletonPreview()
    }
}

@Composable
private fun DsSkeletons() {
    Surface(color = Ds.Color.ElevationBase) {
        Column {
            DsSkeleton {
                Column {
                    Row {
                        Shimmer(
                            figure = DsSkeleton.Figure.Rectangle,
                            modifier = Modifier.size(50.dp, 150.dp),
                        )
                        Spacer(Modifier.width(Ds.Spacing.M10))
                        Shimmer(
                            figure = DsSkeleton.Figure.Rectangle,
                            modifier = Modifier.size(50.dp),
                        )
                        Spacer(Modifier.width(Ds.Spacing.M10))
                        Shimmer(
                            figure = DsSkeleton.Figure.Superellipse,
                            modifier =Modifier.size(50.dp, 200.dp),
                        )
                    }
                    Spacer(Modifier.height(Ds.Spacing.M10))
                    Shimmer(
                        figure = DsSkeleton.Figure.Rectangle,
                        modifier = Modifier.size(160.dp, 50.dp),
                    )
                    Spacer(Modifier.height(Ds.Spacing.M10))
                    Row {
                        Shimmer(
                            figure = DsSkeleton.Figure.Superellipse,
                            modifier = Modifier.size(40.dp),
                        )
                        Spacer(Modifier.width(Ds.Spacing.M6))
                        Shimmer(
                            figure = DsSkeleton.Figure.Superellipse,
                            modifier = Modifier.size(40.dp),
                        )
                        Spacer(Modifier.width(Ds.Spacing.M6))
                        Shimmer(
                            figure = DsSkeleton.Figure.Superellipse,
                            modifier = Modifier.size(40.dp),
                        )
                        Spacer(Modifier.width(Ds.Spacing.M6))
                        Shimmer(
                            figure = DsSkeleton.Figure.Superellipse,
                            modifier = Modifier.size(40.dp),
                        )
                    }
                }
                Spacer(Modifier.height(Ds.Spacing.M10))
                Box(
                    modifier = Modifier.size(200.dp, 50.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Shimmer(
                        figure = DsSkeleton.Figure.Rectangle,
                        modifier = Modifier.size(50.dp),
                    )
                }
                Box(
                    modifier = Modifier.size(200.dp, 200.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Shimmer(
                        figure = DsSkeleton.Figure.Rectangle,
                        modifier = Modifier.size(50.dp),
                    )
                }
            }
        }
    }
}

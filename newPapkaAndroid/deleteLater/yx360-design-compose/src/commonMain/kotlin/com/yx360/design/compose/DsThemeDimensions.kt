package com.yx360.design.compose

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.yx360.design.BrandTheme
import com.yx360.design.UserTheme
import com.yx360.design.compose.internal.DsMaterial
import com.yx360.design.compose.internal.resolveBrandTheme
import com.yx360.design.compose.internal.resolveUserTheme

private val LocalBrandColor = staticCompositionLocalOf<DsBrandColor> {
    throw IllegalArgumentException("Brand color is not set. Use in Ds.BrandTheme context")
}

private val LocalUserColor = staticCompositionLocalOf<DsUserColor> {
    throw IllegalArgumentException("User color is not set. Use in Ds.UserTheme context")
}

@Composable
@ReadOnlyComposable
internal fun getLocalBrandColor() = LocalBrandColor.current

@Composable
@ReadOnlyComposable
internal fun getLocalUserColor() = LocalUserColor.current

@Composable
internal fun DsBrandTheme(
    brandTheme: BrandTheme,
    content: @Composable () -> Unit
) {
    DsBrandTheme(
        getLocalDsBrandColorScheme().resolveBrandTheme(brandTheme),
        content,
    )
}

@Composable
internal fun DsBrandTheme(
    brandColor: DsBrandColor,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalBrandColor provides brandColor,
        content = {
            MaterialTheme(
                colorScheme = DsMaterial.createColorScheme(getLocalDsColor(), brandColor)
            ) {
                content()
            }
        }
    )
}

@Composable
internal fun DsUserTheme(
    userTheme: UserTheme,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalUserColor provides getLocalDsUserColorScheme().resolveUserTheme(userTheme),
        content = content,
    )
}

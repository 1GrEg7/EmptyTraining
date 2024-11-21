package com.yx360.design.compose.atoms.preview

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.yx360.design.BrandTheme
import com.yx360.design.UserTheme
import com.yx360.design.compose.Ds

@Composable
fun DrawAllCases(
    content: @Composable DrawCaseProvider.() -> Unit,
) {
    val caseProvider = IndexBasedCaseProvider()
    content.invoke(caseProvider)
    for (i in 1 until caseProvider.getTotalCasesCount()) {
        caseProvider.setupCase(i)
        content.invoke(caseProvider)
    }
}

interface DrawCaseProvider {
    fun <T> drawEach(vararg cases: T): T
}

@Composable
fun DrawForLightAndDarkTheme(
    orientation: Orientation = Orientation.Horizontal,
    brandTheme: BrandTheme? = null,
    content: @Composable () -> Unit,
) {
    DrawOrientation(orientation) {
        DrawAllCases {
            Ds.Theme(darkTheme = drawEach(false, true), brandTheme = brandTheme) {
                Surface(color = Ds.Color.ElevationBase) {
                    content()
                }
            }
        }
    }
}

@Suppress("SpreadOperator") // used only for previews
@Composable
fun DrawForDifferentSurfaces(
    orientation: Orientation = Orientation.Vertical,
    content: @Composable () -> Unit,
) {
    DrawOrientation(orientation) {
        DrawAllCases {
            Surface(color = drawEach(*ELEVATIONS).invoke()) {
                content()
            }
        }
    }
}

@Suppress("SpreadOperator") // used only for previews
@Composable
fun DrawForEachBrand(
    orientation: Orientation = Orientation.Vertical,
    content: @Composable () -> Unit,
) {
    DrawOrientation(orientation) {
        DrawAllCases {
            Ds.BrandTheme(brandTheme = drawEach(*BrandTheme.entries.toTypedArray())) {
                content()
            }
        }
    }
}

@Suppress("SpreadOperator") // used only for previews
@Composable
fun DrawForEachUser(
    orientation: Orientation = Orientation.Vertical,
    content: @Composable () -> Unit,
) {
    DrawOrientation(orientation) {
        DrawAllCases {
            Ds.UserTheme(userTheme = drawEach(*UserTheme.entries.toTypedArray())) {
                content()
            }
        }
    }
}

@Composable
fun DrawRtl(enabled: Boolean = true, content: @Composable () -> Unit) {
    val direction = if (enabled) LayoutDirection.Rtl else LayoutDirection.Ltr
    CompositionLocalProvider(LocalLayoutDirection provides direction) {
        content()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun DrawOrientation(
    orientation: Orientation,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    when (orientation) {
        Orientation.Vertical -> {
            FlowColumn(modifier) {
                content()
            }
        }
        Orientation.Horizontal -> {
            FlowRow(modifier) {
                content()
            }
        }
    }
}

private val ELEVATIONS = arrayOf<@Composable () -> Color>(
    { Ds.Color.ElevationBase },
    { Ds.Color.ElevationSunken },
    { Ds.Color.ElevationRisen },
    { Ds.Color.ElevationOverlay },
)

private class IndexBasedCaseProvider : DrawCaseProvider {

    private var caseId = 0
    private var handledCases = 1

    fun getTotalCasesCount(): Int {
        return handledCases
    }

    fun setupCase(index: Int) {
        caseId = index
        handledCases = 1
    }

    override fun <T> drawEach(vararg cases: T): T {
        val currentChoiceCasesCount = cases.size
        val result = cases[(caseId / handledCases) % currentChoiceCasesCount]
        handledCases *= currentChoiceCasesCount
        return result
    }
}

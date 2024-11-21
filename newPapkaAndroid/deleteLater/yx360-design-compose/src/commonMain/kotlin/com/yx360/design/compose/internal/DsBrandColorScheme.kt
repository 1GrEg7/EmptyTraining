package com.yx360.design.compose.internal

import androidx.compose.runtime.Immutable
import com.yx360.design.BrandTheme
import com.yx360.design.compose.DsBrandColor

internal object DsBrandColorSchemas {
    val Light = DsBrandColorScheme(
        Mail = DsMailColorSchemas.Light,
        Messenger = DsMessengerColorSchemas.Light,
        Disk = DsDiskColorSchemas.Light,
        Calendar = DsCalendarColorSchemas.Light,
        Telemost = DsTelemostColorSchemas.Light,
        Tables = DsTablesColorSchemas.Light,
        Docs = DsDocsColorSchemas.Light,
        Pres = DsPresColorSchemas.Light,
    )

    val Dark = DsBrandColorScheme(
        Mail = DsMailColorSchemas.Dark,
        Messenger = DsMessengerColorSchemas.Dark,
        Disk = DsDiskColorSchemas.Dark,
        Calendar = DsCalendarColorSchemas.Dark,
        Telemost = DsTelemostColorSchemas.Dark,
        Tables = DsTablesColorSchemas.Dark,
        Docs = DsDocsColorSchemas.Dark,
        Pres = DsPresColorSchemas.Dark,
    )
}

@Immutable
internal class DsBrandColorScheme(
    val Mail: DsBrandColor,
    val Messenger: DsBrandColor,
    val Disk: DsBrandColor,
    val Calendar: DsBrandColor,
    val Telemost: DsBrandColor,
    val Tables: DsBrandColor,
    val Docs: DsBrandColor,
    val Pres: DsBrandColor,
)

internal fun DsBrandColorScheme.resolveBrandTheme(brandTheme: BrandTheme): DsBrandColor {
    return when (brandTheme) {
        BrandTheme.Mail -> Mail
        BrandTheme.Messenger -> Messenger
        BrandTheme.Disk -> Disk
        BrandTheme.Calendar -> Calendar
        BrandTheme.Telemost -> Telemost
        BrandTheme.Tables -> Tables
        BrandTheme.Docs -> Docs
        BrandTheme.Pres -> Pres
    }
}

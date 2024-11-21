package com.yx360.design.compose.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.yx360.design.compose.Ds
import com.yx360.design.compose.resources.Res
import com.yx360.design.compose.resources.il_decor_ai_dark
import com.yx360.design.compose.resources.il_decor_ai_light
import com.yx360.design.compose.resources.il_decor_exel_dark
import com.yx360.design.compose.resources.il_decor_exel_light
import com.yx360.design.compose.resources.il_decor_font_dark
import com.yx360.design.compose.resources.il_decor_font_light
import com.yx360.design.compose.resources.il_decor_img_dark
import com.yx360.design.compose.resources.il_decor_img_light
import com.yx360.design.compose.resources.il_decor_pdf_dark
import com.yx360.design.compose.resources.il_decor_pdf_light
import com.yx360.design.compose.resources.il_decor_pow_dark
import com.yx360.design.compose.resources.il_decor_pow_light
import com.yx360.design.compose.resources.il_decor_ps_dark
import com.yx360.design.compose.resources.il_decor_ps_light
import com.yx360.design.compose.resources.il_decor_tariff_for_family_dark
import com.yx360.design.compose.resources.il_decor_tariff_for_family_light
import com.yx360.design.compose.resources.il_decor_tariff_for_myself_dark
import com.yx360.design.compose.resources.il_decor_tariff_for_myself_light
import com.yx360.design.compose.resources.il_decor_tariff_for_profi_dark
import com.yx360.design.compose.resources.il_decor_tariff_for_profi_light
import com.yx360.design.compose.resources.il_decor_video_dark
import com.yx360.design.compose.resources.il_decor_video_light
import com.yx360.design.compose.resources.il_decor_word_dark
import com.yx360.design.compose.resources.il_decor_word_light
import com.yx360.design.compose.resources.il_logo_gmail_dark
import com.yx360.design.compose.resources.il_logo_gmail_light
import com.yx360.design.compose.resources.il_logo_mail_ru_dark
import com.yx360.design.compose.resources.il_logo_mail_ru_light
import com.yx360.design.compose.resources.il_logo_outlook_dark
import com.yx360.design.compose.resources.il_logo_outlook_light
import com.yx360.design.compose.resources.il_logo_ya_360_3d_dark
import com.yx360.design.compose.resources.il_logo_ya_360_3d_light
import com.yx360.design.compose.resources.il_logo_ya_360_main_dark
import com.yx360.design.compose.resources.il_logo_ya_360_main_light
import com.yx360.design.compose.resources.il_logo_ya_admin_dark
import com.yx360.design.compose.resources.il_logo_ya_admin_light
import com.yx360.design.compose.resources.il_logo_ya_calendar_dark
import com.yx360.design.compose.resources.il_logo_ya_calendar_light
import com.yx360.design.compose.resources.il_logo_ya_concept_dark
import com.yx360.design.compose.resources.il_logo_ya_concept_light
import com.yx360.design.compose.resources.il_logo_ya_contacts_dark
import com.yx360.design.compose.resources.il_logo_ya_contacts_light
import com.yx360.design.compose.resources.il_logo_ya_disk_dark
import com.yx360.design.compose.resources.il_logo_ya_disk_light
import com.yx360.design.compose.resources.il_logo_ya_docs_dark
import com.yx360.design.compose.resources.il_logo_ya_docs_light
import com.yx360.design.compose.resources.il_logo_ya_forms_dark
import com.yx360.design.compose.resources.il_logo_ya_forms_light
import com.yx360.design.compose.resources.il_logo_ya_gpt_dark
import com.yx360.design.compose.resources.il_logo_ya_gpt_light
import com.yx360.design.compose.resources.il_logo_ya_mail_dark
import com.yx360.design.compose.resources.il_logo_ya_mail_light
import com.yx360.design.compose.resources.il_logo_ya_messenger_dark
import com.yx360.design.compose.resources.il_logo_ya_messenger_light
import com.yx360.design.compose.resources.il_logo_ya_notes_dark
import com.yx360.design.compose.resources.il_logo_ya_notes_light
import com.yx360.design.compose.resources.il_logo_ya_orbita_ds_01_dark
import com.yx360.design.compose.resources.il_logo_ya_orbita_ds_01_light
import com.yx360.design.compose.resources.il_logo_ya_orbita_ds_02_dark
import com.yx360.design.compose.resources.il_logo_ya_orbita_ds_02_light
import com.yx360.design.compose.resources.il_logo_ya_orbita_ds_03_dark
import com.yx360.design.compose.resources.il_logo_ya_orbita_ds_03_light
import com.yx360.design.compose.resources.il_logo_ya_orbita_ds_04_dark
import com.yx360.design.compose.resources.il_logo_ya_orbita_ds_04_light
import com.yx360.design.compose.resources.il_logo_ya_orbita_ds_05_dark
import com.yx360.design.compose.resources.il_logo_ya_orbita_ds_05_light
import com.yx360.design.compose.resources.il_logo_ya_pdd_dark
import com.yx360.design.compose.resources.il_logo_ya_pdd_light
import com.yx360.design.compose.resources.il_logo_ya_sender_dark
import com.yx360.design.compose.resources.il_logo_ya_sender_light
import com.yx360.design.compose.resources.il_logo_ya_staff_dark
import com.yx360.design.compose.resources.il_logo_ya_staff_light
import com.yx360.design.compose.resources.il_logo_ya_telemost_dark
import com.yx360.design.compose.resources.il_logo_ya_telemost_light
import com.yx360.design.compose.resources.il_logo_ya_tracker_dark
import com.yx360.design.compose.resources.il_logo_ya_tracker_light
import com.yx360.design.compose.resources.il_logo_ya_wiki_dark
import com.yx360.design.compose.resources.il_logo_ya_wiki_light
import org.jetbrains.compose.resources.painterResource

/**
 * Automatically generated file. DO NOT MODIFY
 */
internal object DsIllustrationsR {

    @Composable
    fun decorAi(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_ai_light
            } else {
                Res.drawable.il_decor_ai_dark
            },
        )
    }

    @Composable
    fun decorExel(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_exel_light
            } else {
                Res.drawable.il_decor_exel_dark
            },
        )
    }

    @Composable
    fun decorFont(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_font_light
            } else {
                Res.drawable.il_decor_font_dark
            },
        )
    }

    @Composable
    fun decorImg(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_img_light
            } else {
                Res.drawable.il_decor_img_dark
            },
        )
    }

    @Composable
    fun decorPdf(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_pdf_light
            } else {
                Res.drawable.il_decor_pdf_dark
            },
        )
    }

    @Composable
    fun decorPow(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_pow_light
            } else {
                Res.drawable.il_decor_pow_dark
            },
        )
    }

    @Composable
    fun decorPs(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_ps_light
            } else {
                Res.drawable.il_decor_ps_dark
            },
        )
    }

    @Composable
    fun decorTariffForFamily(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_tariff_for_family_light
            } else {
                Res.drawable.il_decor_tariff_for_family_dark
            },
        )
    }

    @Composable
    fun decorTariffForMyself(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_tariff_for_myself_light
            } else {
                Res.drawable.il_decor_tariff_for_myself_dark
            },
        )
    }

    @Composable
    fun decorTariffForProfi(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_tariff_for_profi_light
            } else {
                Res.drawable.il_decor_tariff_for_profi_dark
            },
        )
    }

    @Composable
    fun decorVideo(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_video_light
            } else {
                Res.drawable.il_decor_video_dark
            },
        )
    }

    @Composable
    fun decorWord(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_decor_word_light
            } else {
                Res.drawable.il_decor_word_dark
            },
        )
    }

    @Composable
    fun logoGmail(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_gmail_light
            } else {
                Res.drawable.il_logo_gmail_dark
            },
        )
    }

    @Composable
    fun logoMailRu(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_mail_ru_light
            } else {
                Res.drawable.il_logo_mail_ru_dark
            },
        )
    }

    @Composable
    fun logoOutlook(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_outlook_light
            } else {
                Res.drawable.il_logo_outlook_dark
            },
        )
    }

    @Composable
    fun logoYa360_3d(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_360_3d_light
            } else {
                Res.drawable.il_logo_ya_360_3d_dark
            },
        )
    }

    @Composable
    fun logoYa360_Main(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_360_main_light
            } else {
                Res.drawable.il_logo_ya_360_main_dark
            },
        )
    }

    @Composable
    fun logoYaAdmin(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_admin_light
            } else {
                Res.drawable.il_logo_ya_admin_dark
            },
        )
    }

    @Composable
    fun logoYaCalendar(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_calendar_light
            } else {
                Res.drawable.il_logo_ya_calendar_dark
            },
        )
    }

    @Composable
    fun logoYaConcept(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_concept_light
            } else {
                Res.drawable.il_logo_ya_concept_dark
            },
        )
    }

    @Composable
    fun logoYaContacts(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_contacts_light
            } else {
                Res.drawable.il_logo_ya_contacts_dark
            },
        )
    }

    @Composable
    fun logoYaDisk(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_disk_light
            } else {
                Res.drawable.il_logo_ya_disk_dark
            },
        )
    }

    @Composable
    fun logoYaDocs(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_docs_light
            } else {
                Res.drawable.il_logo_ya_docs_dark
            },
        )
    }

    @Composable
    fun logoYaForms(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_forms_light
            } else {
                Res.drawable.il_logo_ya_forms_dark
            },
        )
    }

    @Composable
    fun logoYaGpt(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_gpt_light
            } else {
                Res.drawable.il_logo_ya_gpt_dark
            },
        )
    }

    @Composable
    fun logoYaMail(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_mail_light
            } else {
                Res.drawable.il_logo_ya_mail_dark
            },
        )
    }

    @Composable
    fun logoYaMessenger(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_messenger_light
            } else {
                Res.drawable.il_logo_ya_messenger_dark
            },
        )
    }

    @Composable
    fun logoYaNotes(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_notes_light
            } else {
                Res.drawable.il_logo_ya_notes_dark
            },
        )
    }

    @Composable
    fun logoYaOrbitaDs01(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_orbita_ds_01_light
            } else {
                Res.drawable.il_logo_ya_orbita_ds_01_dark
            },
        )
    }

    @Composable
    fun logoYaOrbitaDs02(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_orbita_ds_02_light
            } else {
                Res.drawable.il_logo_ya_orbita_ds_02_dark
            },
        )
    }

    @Composable
    fun logoYaOrbitaDs03(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_orbita_ds_03_light
            } else {
                Res.drawable.il_logo_ya_orbita_ds_03_dark
            },
        )
    }

    @Composable
    fun logoYaOrbitaDs04(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_orbita_ds_04_light
            } else {
                Res.drawable.il_logo_ya_orbita_ds_04_dark
            },
        )
    }

    @Composable
    fun logoYaOrbitaDs05(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_orbita_ds_05_light
            } else {
                Res.drawable.il_logo_ya_orbita_ds_05_dark
            },
        )
    }

    @Composable
    fun logoYaPdd(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_pdd_light
            } else {
                Res.drawable.il_logo_ya_pdd_dark
            },
        )
    }

    @Composable
    fun logoYaSender(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_sender_light
            } else {
                Res.drawable.il_logo_ya_sender_dark
            },
        )
    }

    @Composable
    fun logoYaStaff(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_staff_light
            } else {
                Res.drawable.il_logo_ya_staff_dark
            },
        )
    }

    @Composable
    fun logoYaTelemost(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_telemost_light
            } else {
                Res.drawable.il_logo_ya_telemost_dark
            },
        )
    }

    @Composable
    fun logoYaTracker(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_tracker_light
            } else {
                Res.drawable.il_logo_ya_tracker_dark
            },
        )
    }

    @Composable
    fun logoYaWiki(): Painter {
        return painterResource(
            resource = if (Ds.IsDarkTheme) {
                Res.drawable.il_logo_ya_wiki_light
            } else {
                Res.drawable.il_logo_ya_wiki_dark
            },
        )
    }
}

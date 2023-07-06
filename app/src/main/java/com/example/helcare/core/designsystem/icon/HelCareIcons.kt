package com.example.helcare.core.designsystem.icon

import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ChevronRight
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.helcare.R

object HelCareIcons {
    val FilledArrowRightCircle = R.drawable.arrow_right_circle
    val Doctor = R.drawable.doctor_male
    val ChevronRight = Icons.Rounded.ChevronRight
    val GoogleLogo = R.drawable.icons8_google_24
}

sealed interface HelCareIcon {
    data class ImageVectorIcon(val imageVector: ImageVector) : HelCareIcon
    data class PainterResourceIcon(@DrawableRes val id: Int) : HelCareIcon
}
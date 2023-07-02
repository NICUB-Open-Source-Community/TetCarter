package com.example.helcare.core.designsystem.icon

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.helcare.R

object HelCareIcons {
    val ArrowRightCircle = R.drawable.arrow_right_circle
}

sealed interface HelCareIcon {
    data class ImageVectorIcon(val imageVector: ImageVector) : HelCareIcon
    data class PainterResourceIcon(@DrawableRes val id: Int) : HelCareIcon
}
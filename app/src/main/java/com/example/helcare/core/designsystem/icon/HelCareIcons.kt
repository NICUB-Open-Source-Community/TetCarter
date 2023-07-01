package com.example.helcare.core.designsystem.icon

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector

object HelCareIcons {
}

sealed interface HelCareIcon {
    data class ImageVectorIcon(val imageVector: ImageVector) : HelCareIcon
    data class PainterResourceIcon(@DrawableRes val id: Int) : HelCareIcon
}
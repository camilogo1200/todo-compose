package com.camilogo1200.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.camilogo1200.todocompose.ui.theme.DonePriorityTaskColor
import com.camilogo1200.todocompose.ui.theme.HighPriorityTaskColor
import com.camilogo1200.todocompose.ui.theme.LowPriorityTaskColor
import com.camilogo1200.todocompose.ui.theme.MediumPriorityTaskColor
import com.camilogo1200.todocompose.ui.theme.NonePriorityTaskColor
import com.camilogo1200.todocompose.ui.theme.UrgentPriorityTaskColor

enum class Priority(val color: Color) {
    URGENT(UrgentPriorityTaskColor),
    HIGH(HighPriorityTaskColor),
    MEDIUM(MediumPriorityTaskColor),
    LOW(LowPriorityTaskColor),
    NONE(NonePriorityTaskColor),
    DONE(DonePriorityTaskColor)
}
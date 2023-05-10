package com.example.devan006_affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val sringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)
 
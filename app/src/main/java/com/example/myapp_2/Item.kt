package com.example.my_app_2

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Item(
    @StringRes val name: Int,

    @DrawableRes val imageRes: Int
)

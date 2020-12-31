package com.mashudi.dimasapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Mangas (
    val title: String="",
    val thumb: String="",
    val type: String="",
    val updated_on: String="",
    val endpoint: String="",
    val chapter: String=""
) : Parcelable
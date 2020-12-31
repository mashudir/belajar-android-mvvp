package com.mashudi.dimasapp.data.model

data class MangaList (
    val manga_list: List<Mangas> = arrayListOf(),
    val message: String = "",
    val status: Boolean = true
)
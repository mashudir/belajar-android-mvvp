package com.mashudi.dimasapp.data.remote

import com.mashudi.dimasapp.data.model.MangaList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MangaService {
    @GET( "manga/page/1")
    fun listManga() : Call<MangaList>

    @GET("manga/detail/")
    fun detailManga(@Query("url")url: String) : Call<MangaList>

    @GET("manga/search/")
    fun searchManga(@Query("q") query: String) : Call<MangaList>
}
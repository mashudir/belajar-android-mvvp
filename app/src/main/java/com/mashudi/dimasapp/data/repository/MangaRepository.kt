package com.mashudi.dimasapp.data.repository

import com.mashudi.dimasapp.data.model.ActionState
import com.mashudi.dimasapp.data.model.Mangas
import com.mashudi.dimasapp.data.remote.MangaService
import com.mashudi.dimasapp.data.remote.RetrofitApi
import retrofit2.await
import java.lang.Exception

class MangaRepository {
    private val mangaService: MangaService by lazy { RetrofitApi.mangaService() }

    suspend fun listManga() : ActionState<List<Mangas>> {
        return try {
            val list = mangaService.listManga().await()
            ActionState(list.manga_list)
        }catch (e: Exception) {
            ActionState(message = e.message, isSuccess = false)
        }
    }
    suspend fun detailManga(url: String) : ActionState<Mangas> {
        return try {
            val list = mangaService.detailManga(url).await()
            ActionState(list.manga_list.first())
        }catch (e: Exception) {
            ActionState(message = e.message, isSuccess = false)
        }
    }
    suspend fun searchManga(query: String) : ActionState<List<Mangas>> {
        return try {
            val list = mangaService.searchManga(query).await()
            ActionState(list.manga_list)
        }catch (e: Exception){
            ActionState(message = e.message, isSuccess = false)
        }
    }
}
package com.mashudi.dimasapp.ui.manga

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.bumptech.glide.Glide
import com.mashudi.dimasapp.R
import com.mashudi.dimasapp.data.model.Mangas
import com.mashudi.dimasapp.databinding.ItemMangaBinding
import com.mashudi.dimasapp.ui.base.BaseAdapter

class MangaAdapter(val context: Context) : BaseAdapter<Mangas>(R.layout.item_manga) {
    override fun onBind(binding: ViewDataBinding?, data: Mangas) {
        val mBinding = binding as ItemMangaBinding
        Glide.with(context).load(data.thumb).into(mBinding.itemThumb)
    }

    override fun onClick(binding: ViewDataBinding?, data: Mangas) {
        val intent = Intent(context, MangaActivity::class.java)
        intent.putExtra(MangaActivity.OPEN_MANGA, data)
        context.startActivity(intent)
    }
}
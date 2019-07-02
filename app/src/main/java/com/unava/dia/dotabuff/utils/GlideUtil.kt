package com.unava.dia.dotabuff.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class GlideUtil {
    companion object {
        fun setHeroIconSmall(imageView: ImageView, imageName: String) {
            var url = imageName.replace("npc_dota_hero_", "http://cdn.dota2.com/apps/dota2/images/heroes/")
            url = url + "_sb.png"

            val imageUrl = StringBuilder()
                .append(url)
                .toString()

            val context = imageView.context

            Glide.with(context).load(imageUrl)
                .apply(RequestOptions().override(59, 33))
                .into(imageView)
        }
    }
}
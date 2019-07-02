package com.unava.dia.dotabuff.ui.adapters

import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.unava.dia.dotabuff.R


class OneMatchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    internal var heroIcon: ImageView
    internal var nickname: TextView

    internal var kills: TextView
    internal var deaths: TextView
    internal var assists: TextView

    internal var netwotrh: TextView
    internal var lhdn: TextView
    internal var gpmxpm: TextView

    internal var dmg: TextView
    internal var heal: TextView
    internal var bld: TextView
    internal var wards: TextView

    init {
        heroIcon = itemView.findViewById(R.id.heroIcon)
        nickname = itemView.findViewById(R.id.nickname)

        kills = itemView.findViewById(R.id.kills)
        deaths = itemView.findViewById(R.id.deaths)
        assists = itemView.findViewById(R.id.assists)

        netwotrh = itemView.findViewById(R.id.networth)
        lhdn = itemView.findViewById(R.id.lhdn)
        gpmxpm = itemView.findViewById(R.id.gpmxpm)

        dmg = itemView.findViewById(R.id.dmg)
        heal = itemView.findViewById(R.id.heal)
        bld = itemView.findViewById(R.id.bld)

        wards = itemView.findViewById(R.id.wards)

    }

}
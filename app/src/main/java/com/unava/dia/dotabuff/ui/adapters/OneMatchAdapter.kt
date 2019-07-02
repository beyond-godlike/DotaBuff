package com.unava.dia.dotabuff.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.content.Context
import android.support.v7.widget.RecyclerView
import com.unava.dia.dotabuff.R
import com.unava.dia.dotabuff.data.match.Match
import com.unava.dia.dotabuff.data.match.Result
import com.unava.dia.dotabuff.utils.GlideUtil


class OneMatchAdapter(internal var c: Context, l: Match, heroesMap: HashMap<Int, String>) :
    RecyclerView.Adapter<OneMatchViewHolder>() {
    private var list: ArrayList<Result> = ArrayList()
    private var icons: Map<Int, String> = HashMap()

    init {
        this.list = l.players!!
        this.icons = heroesMap
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OneMatchViewHolder {
        //View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.articles_model, null);
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_one_match, parent, false)


        //TODO
        return OneMatchViewHolder(v)
    }


    override fun onBindViewHolder(holder: OneMatchViewHolder, position: Int) {
        var heroName: String? = this.icons[list[position].heroId]
        GlideUtil.setHeroIconSmall(holder.heroIcon, heroName!!)

        holder.nickname.text = (list[position].accountId.toString())

        holder.kills.text = (list[position].kills.toString())
        holder.deaths.text = (list[position].deaths.toString())
        holder.assists.text = (list[position].assists.toString())

        holder.netwotrh.text = (list[position].goldSpent.toString())
        holder.lhdn.text = (list[position].lastHits.toString() + " / " +
                list[position].denies.toString() )

        holder.gpmxpm.text = (list[position].gpm.toString() + " / " +
                list[position].xpm.toString())

        holder.dmg.text = (list[position].heroDamage.toString())
        holder.heal.text = (list[position].heroHealing.toString())
        holder.bld.text = (list[position].towerDamage.toString())
        //holder.wards.text = (list[position]?.players!![position]?.wards.toString())

    }

    override fun getItemCount(): Int {
        return list.size
    }

}
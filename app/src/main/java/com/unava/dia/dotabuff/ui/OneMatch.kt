package com.unava.dia.dotabuff.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import com.unava.dia.dotabuff.R

import android.support.v7.widget.RecyclerView
import android.util.Log
import com.unava.dia.dotabuff.data.heroes.Hero
import com.unava.dia.dotabuff.data.heroes.Heroes
import com.unava.dia.dotabuff.di.ApiInterface
import com.unava.dia.dotabuff.di.App
import com.unava.dia.dotabuff.ui.adapters.OneMatchAdapter
import org.kodein.di.generic.instance
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import retrofit2.Retrofit
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlin.collections.HashMap

class OneMatch : AppCompatActivity(), KodeinAware {

    override lateinit var kodein: Kodein
    private val retrofit: Retrofit by instance()
    private lateinit var apiInterface: ApiInterface

    //val r: ArrayList<String> = ArrayList()
    private val heroesMap: HashMap<Int, String> = HashMap()

    var accId: String = "4720228752"
    private var KEY: String = "KEY"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_match)
        kodein = (application as App).kodein

        accId = intent.getStringExtra("value").toString()
        apiInterface = retrofit.create(ApiInterface::class.java)

        // делаем запрос к серву, даем ключ и номер матча
        // выставляем все в гуй

        //val icons: RealmResults<HeroIcons> = getRealmIcons()
        getHeroes()

        getPlayerMatch(accId, heroesMap)
    }

    fun regen (heroNamesAndIcons : Heroes) {
        heroNamesAndIcons.result!!.heroes!!.withIndex().forEach { (i, temp: Hero) ->
            heroesMap.put(temp.id!!, temp.name!!)
        }
    }

    // get hero idi`s
    // get hero names using id`s
    // load image http://cdn.dota2.com/apps/dota2/images/heroes/HERONAME_SUFFIX
    // witch_doctor_sb.png


    // sb.png: 59x33px small horizontal portrait
    // lg.png: 205x105px large horizontal portrait
    // full.png: 256x144px full-quality horizontal portrait
    // vert.jpg: 235x272px full-quality vertical portrait (note that this is a .jpg)

    @SuppressLint("CheckResult")
    fun getHeroes()  {
        apiInterface.getHeroes(KEY)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                    result -> regen(result)

            }, { error ->
                error.printStackTrace()
            })
    }




    @SuppressLint("CheckResult")
    fun getPlayerMatch(accId: String, map: HashMap<Int, String>) {
        //apiInterface = retrofit.create(ApiInterface::class.java)
        apiInterface.getMatch(accId, KEY)
        //apiInterface.getMatch()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { li ->
                val rv = findViewById<RecyclerView>(R.id.matchStats)
                val adapter = OneMatchAdapter(this@OneMatch, li.match!!, map)
                rv.adapter = adapter
                rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL ,false)
                //Log.d("ssss", li.toString())
            }
    }
}

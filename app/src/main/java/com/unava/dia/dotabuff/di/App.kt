package com.unava.dia.dotabuff.di

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import io.realm.Realm
import io.realm.RealmConfiguration

class App : Application(), KodeinAware {
    val BASE_URL = "https://api.steampowered.com/"

    override val kodein by Kodein.lazy {

        // provide retrofit
        bind<Retrofit>() with singleton {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        }
    }

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)

    }
}
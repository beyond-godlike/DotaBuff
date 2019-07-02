package com.unava.dia.dotabuff.di

import com.unava.dia.dotabuff.data.heroes.Heroes
import com.unava.dia.dotabuff.data.history.History
import com.unava.dia.dotabuff.data.match.Player
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("IDOTA2Match_570/GetMatchDetails/v1/")
    fun getMatch(@Query("match_id") matchId: String,
                 @Query("key")key: String) : Observable<Player>

    @GET("IDOTA2Match_570/GetMatchHistory/V001/")
    fun getHistory(@Query("account_id") accountId: String,
                   @Query("key") key: String) : Observable<History>

    @GET("IEconDOTA2_570/GetHeroes/v0001/")
    fun getHeroes(@Query("key") key: String) : Observable<Heroes>

    //fun getMovies(@Query("page") page: Int): Observable<MovieResult>
}
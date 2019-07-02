package com.unava.dia.dotabuff.data.history

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PlayerOfHistory (

    @SerializedName("account_id")
    @Expose
    var accountId: Int? = null,

    @SerializedName("player_slot")
    @Expose
    var playerSlot: Int? = null,

    @SerializedName("hero_id")
    @Expose
    var heroId: Int? = null
)
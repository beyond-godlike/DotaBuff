package com.unava.dia.dotabuff.data.match

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Player(@SerializedName("result")
                   @Expose
                   var match: Match? = null
)
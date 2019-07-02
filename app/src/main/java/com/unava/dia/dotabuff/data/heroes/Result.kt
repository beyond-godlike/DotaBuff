package com.unava.dia.dotabuff.data.heroes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Result (@SerializedName("heroes")
                   @Expose
                   var heroes: ArrayList<Hero>? = null,

                    @SerializedName("status")
                    @Expose
                    var status: Int? = null,

                    @SerializedName("count")
                    @Expose
                    var count: Int? = null
)
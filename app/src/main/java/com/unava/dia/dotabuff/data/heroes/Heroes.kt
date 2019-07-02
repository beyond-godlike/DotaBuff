package com.unava.dia.dotabuff.data.heroes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Heroes (@SerializedName("result")
                    @Expose
                    var result: Result? = null
)
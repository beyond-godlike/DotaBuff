package com.unava.dia.dotabuff.data.heroes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Hero (@SerializedName("name")
                    @Expose
                    var name: String? = null,

                    @SerializedName("id")
                    @Expose
                    var id: Int? = null
)
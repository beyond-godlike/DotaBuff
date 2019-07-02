package com.unava.dia.dotabuff.data.history

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class History (@SerializedName("status")
                  @Expose
                    var status: Int? = null,

                    @SerializedName("num_results")
                  @Expose
                    var numResults: Int? = null,

                    @SerializedName("total_results")
                  @Expose
                    var totalResults: Int? = null,

                    @SerializedName("results_remaining")
                  @Expose
                    var resultsRemaining: Int? = null,

                    @SerializedName("matches")
                  @Expose
                    var matches: ArrayList<MatchOfHistory>? = null
)
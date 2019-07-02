package com.unava.dia.dotabuff.data.history


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MatchOfHistory (

                  @SerializedName("match_id")
                  @Expose
                  var matchId: Int? = null,

                  @SerializedName("match_seq_num")
                  @Expose
                  var matchSeqNum: Int? = null,

                  @SerializedName("match_start_time")
                  @Expose
                  var matchStartTime: Int? = null,

                  @SerializedName("lobby_type")
                  @Expose
                  var lobbyType: Int? = null,

                  @SerializedName("radiant_team_id")
                  @Expose
                  var radiantTeamId: Int? = null,

                  @SerializedName("dire_team_id")
                  @Expose
                  var direTeamId: Int? = null,

                  @SerializedName("players")
                  @Expose
                  var players: ArrayList<PlayerOfHistory>? = null
)
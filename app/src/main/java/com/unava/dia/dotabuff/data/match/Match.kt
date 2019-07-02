package com.unava.dia.dotabuff.data.match

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Match (@SerializedName("players")
                  @Expose
                  var players: ArrayList<Result>? = null,

                  @SerializedName("radiant_win")
                  @Expose
                  var radiantWin: Boolean? = false,

                  @SerializedName("duration")
                  @Expose
                  var duration: Int? = null,

                  @SerializedName("pre_game_duration")
                  @Expose
                  var preGameDuration: Int? = null,

                  @SerializedName("start_time")
                  @Expose
                  var startTime: Float? = null,

                  @SerializedName("match_id")
                  @Expose
                  var matchId: Float? = null,

                  @SerializedName("match_seq_num")
                  @Expose
                  var matchSeqNum: Float? = null,

                  @SerializedName("tower_status_radiant")
                  @Expose
                  var towerStatusRadiant: Int? = null,

                  @SerializedName("tower_status_dire")
                  @Expose
                  var towerStatusDire: Int? = null,

                  @SerializedName("barracks_status_radiant")
                  @Expose
                  var barracksStatusRadiant: Int? = null,

                  @SerializedName("barracks_status_dire")
                  @Expose
                  var barracksStatusDire: Int? = null,

                  @SerializedName("cluster")
                  @Expose
                  var cluster: Int? = null,

                  @SerializedName("first_blood_time")
                  @Expose
                  var firstBloodTime: Int? = null,

                  @SerializedName("lobby_type")
                  @Expose
                  var lobbyType: Int? = null,

                  @SerializedName("human_players")
                  @Expose
                  var humanPlayers: Int? = null,

                  @SerializedName("leagueid")
                  @Expose
                  var leagueid: Int? = null,

                  @SerializedName("positive_votes")
                  @Expose
                  var positiveVotes: Int? = null,

                  @SerializedName("negative_votes")
                  @Expose
                  var negativeVotes: Int? = null,

                  @SerializedName("game_mode")
                  @Expose
                  var gameMode: Int? = null,

                  @SerializedName("flags")
                  @Expose
                  var flags: Int? = null,

                  @SerializedName("engine")
                  @Expose
                  var engine: Int? = null,

                  @SerializedName("radiant_score")
                  @Expose
                  var radiantScore: Int? = null,

                  @SerializedName("dire_score")
                  @Expose
                  var direScore: Int? = null,

                  @SerializedName("picks_bans")
                  @Expose
                  var picksBans: Any? = null
                  )
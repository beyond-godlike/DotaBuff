package com.unava.dia.dotabuff.data.match

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Result (@SerializedName("account_id")
                   @Expose
                   var accountId: Float? = null,

                   @SerializedName("player_slot")
                   @Expose
                   var playerSlot: Int? = null,

                   @SerializedName("hero_id")
                   @Expose
                   var heroId: Int? = null,

                   @SerializedName("item_0")
                   @Expose
                   var item0: Int? = null,

                   @SerializedName("item_1")
                   @Expose
                   var item1: Int? = null,

                   @SerializedName("item_2")
                   @Expose
                   var item2: Int? = null,

                   @SerializedName("item_3")
                   @Expose
                   var item3: Int? = null,

                   @SerializedName("item_4")
                   @Expose
                   var item4: Int? = null,

                   @SerializedName("item_5")
                   @Expose
                   var item5: Int? = null,

                   @SerializedName("backpack_0")
                   @Expose
                   var backpack0: Int? = null,

                   @SerializedName("backpack_1")
                   @Expose
                   var backpack1: Int? = null,

                   @SerializedName("backpack_2")
                   @Expose
                   var backpack2: Int? = null,

                   @SerializedName("kills")
                   @Expose
                   var kills: Int? = null,

                   @SerializedName("deaths")
                   @Expose
                   var deaths: Int? = null,

                   @SerializedName("assists")
                   @Expose
                   var assists: Int? = null,

                   @SerializedName("leaver_status")
                   @Expose
                   var leaverStatus: Int? = null,

                   @SerializedName("last_hits")
                   @Expose
                   var lastHits: Int? = null,

                   @SerializedName("denies")
                   @Expose
                   var denies: Int? = null,

                   @SerializedName("gold_per_min")
                   @Expose
                   var gpm: Int? = null,

                   @SerializedName("xp_per_min")
                   @Expose
                   var xpm: Int? = null,

                   @SerializedName("level")
                   @Expose
                   var level: Int? = null,

                   @SerializedName("hero_damage")
                   @Expose
                   var heroDamage: Int? = null,

                   @SerializedName("tower_damage")
                   @Expose
                   var towerDamage: Int? = null,

                   @SerializedName("hero_healing")
                   @Expose
                   var heroHealing: Int? = null,

                   @SerializedName("gold")
                   @Expose
                   var gold: Int? = null,

                   @SerializedName("gold_spent")
                   @Expose
                   var goldSpent: Int? = null,

                   @SerializedName("scaled_hero_damage")
                   @Expose
                   var scaledHeroDamage: Int? = null,

                   @SerializedName("scaled_tower_damage")
                   @Expose
                   var scaledTowerDamage: Int? = null,

                   @SerializedName("scaled_hero_healing")
                   @Expose
                   var scaledHeroHealing: Int? = null,

                   @SerializedName("ability_upgrades")
                   @Expose
                   var abilityUpgrades: Any? = null
)
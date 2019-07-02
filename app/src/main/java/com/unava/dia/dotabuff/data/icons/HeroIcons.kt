package com.unava.dia.dotabuff.data.icons

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass


@RealmClass
open class HeroIcons(@SerializedName("localized_name")
                            @Expose
                            open var localized_name: String? = null,

                            @SerializedName("url_full_portrait")
                            @Expose
                            open var url_full_portrait: String? = null,

                            @SerializedName("name")
                            @Expose
                            open var name: String? = null,

                            @SerializedName("url_small_portrait")
                            @Expose
                            open var url_small_portrait: String? = null,

                            @SerializedName("url_large_portrait")
                            @Expose
                            open var url_large_portrait: String? = null,

                            @SerializedName("turl_vertical_portrai")
                            @Expose
                            open var url_vertical_portrai: String? = null,

                            @SerializedName("id")
                            @Expose
                            open var id: Int? = null) : RealmObject() {}
					  
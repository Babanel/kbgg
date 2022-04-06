package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.domain.geekdo.Images
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ImagesApi {

    @GET("images")
    fun getImages(@Query("objectid") thingId:Int,
                  @Query("ajax") ajax:Int = 1,
                  @Query("gallery") gallery:String = "all",
                  @Query("nosession") nosession:Int = 1,
                  @Query("objecttype") objecttype:String = "thing",
                  @Query("pageid") pageid:Int = 1,
                  @Query("showcount") showcount:Int = 50,
                  @Query("size") size:String = "thumb",
                  @Query("sort") sort:String = "recent",
                  @Query("interval") interval:String = "alltime",
                  @Query("tag") tag:String = "",
                  @Query("licensefilter") licensefilter:String = ""
                  ): Call<Images>

    /**
    objectid: the ID of the thing you want to get images of
    ajax: "1"
    gallery: "all", "game", "people", "creative"
    nosession: "1"
    objecttype: "thing", "person"
    pageid: "1"
    showcount: "50"
    size: "thumb", "micro", "square", "squarefit", "tallthumb", "previewthumb", "square200"
    sort: "hot", "recent"
    interval: "alltime", "today", "twodays", "last7", "last30", "year"
    tag: "", "BoxFront", "BoxBack", "Components", "Customized", "Play", "Miscellaneous", "uncat"
    licensefilter: "", "reuse", "commercial", "modify"
     */

}
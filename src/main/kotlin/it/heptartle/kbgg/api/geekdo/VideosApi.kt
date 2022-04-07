package it.heptartle.kbgg.api.geekdo

import it.heptartle.kbgg.domain.geekdo.Videos
import org.intellij.lang.annotations.Language
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface VideosApi {

    @GET("videos")
    fun getVideos(@Query("objectid") objectid:Int,
                  @Query("ajax") ajax:Int = 1,
                  @Query("nosession") nosession:Int = 1,
                  @Query("objecttype") objecttype:String = "thing",
                  @Query("pageid") pageid:Int = 1,
                  @Query("showcount") sortshowncount:Int = 50,
                  @Query("sort") sortshownsort:String = "hot",
                  @Query("languageid") languageid:String = "0",
                  @Query("gallery") gallery:String = "all"
                ): Call<Videos>
}


        /**
        objectid: the ID of the thing you want to get videos of
        ajax: "1"
        objecttype: "thing", "person"
        nosession: "1"
        pageid: "1"
        showcount: "50"
        sort: "hot", "recent"
        gallery: "all", "review", "session", "instructional", "interview", "unboxing", "humor", "other"
        languageid: the language id for the videos

         */

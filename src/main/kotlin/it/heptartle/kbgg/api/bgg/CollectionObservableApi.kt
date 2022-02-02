package it.heptartle.kbgg.api.bgg


import it.heptartle.kbgg.domain.bgg.UserCollection
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.rxjava3.core.Observable



interface CollectionObservableApi {
    @GET("collection")
    fun getCollection(@Query("username") username: String,
                 @Query("version") version: Int = 0,
                 @Query("excludesubtype") excludesubtype: String,
                 @Query("stats") stats: Int = 0,
                 @Query("own") own: Int

    ): Observable<UserCollection>
            //Observable<Call<UserCollection>>

}


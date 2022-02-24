package it.heptartle.kbgg.factory

import com.google.gson.GsonBuilder
import it.heptartle.kbgg.api.bgg.*
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit




object BggLoginServiceFactory {

    fun getLoginService(): LoginApi =
        bggService.create(LoginApi::class.java)

    private var client: OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS).build()

    private val bggService: Retrofit =
        Retrofit.Builder()
            .baseUrl("https://boardgamegeek.com/")
            .client(client)
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder()
                        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                        .create()))
            .build()

}
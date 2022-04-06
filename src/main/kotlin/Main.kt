
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.Consumer
import it.heptartle.kbgg.domain.bgg.Item
import it.heptartle.kbgg.domain.bgg.Items
import it.heptartle.kbgg.domain.bgg.UserCollection
import it.heptartle.kbgg.factory.BggServiceFactory
import it.heptartle.kbgg.factory.GeekdoServiceFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception
import java.util.ArrayList





fun main() {
/*
    val service = BggServiceFactory.getSearchService()
    val body = service.search("feast for odin").execute().body()
    println(body!!)
*/

/*
    /**
     * Testing for Images Service
     */

    val geekdoService = GeekdoServiceFactory.getImageService()
    val images = geekdoService.getImages(291457, showcount = 1, sort = "hot").execute().body()
    println(images)

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


 */

    /**
     * Testing for Thing Service
     */
/*

    var collection = mutableListOf<Item?>()
    val items = mutableListOf( "291457")
    val service = BggServiceFactory.getThingService()

    service.getThing(items.joinToString(), 1, 1, 0)
        .enqueue(object : Callback<Items?> {
            override fun onResponse(call: Call<Items?>, response: Response<Items?>) {
                val body = response.body()

                collection.addAll(body!!.items as Collection<Item>)
              collection.forEach {
                  println(
                      it?.videos?.videoList?.map{it.id}

                  )
                 // println(it?.description)
              }

            }

            override fun onFailure(call: Call<Items?>, t: Throwable) {
println(t)
            }

        })
*/

    /**
     * Testing for Collection Service
     */
/*
val user = "657uytut"
    val service = BggServiceFactory.getCollectionService()
    val items: MutableList<String> = mutableListOf()
    println ("getUserCollection - user: $user")
    service.getCollection(user, 0, "boardgameexpansion", 0, 1)
        .enqueue(object : Callback<UserCollection> {

            override fun onResponse(
                call: Call<UserCollection?>,
                response: Response<UserCollection?>
            ) {
                //Log.d("bggTesting", "getUserCollection - Response code - ${response.code()}")

                val body = response.body()
                if (body != null) {
                    println(body.error.toString())
                    if (body.error == null){
                    items.addAll(
                        body.collectionItems?.map {
                            it.objectid.toString()
                        }!!
                    )
                    //gameIdList.addAll(items)
                    //getGamesFromService(items)
println("Items = $items")}else {
                        println("Error = ${body.error!!.map { it.message }}")
                    }
                } else {
                    //Log.d("bggTesting", "getUserCollection - Body Null")

                }
            }

            override fun onFailure(call: Call<UserCollection?>, t: Throwable) {
                //super.onFailure(call, t)
                //Log.d("bggTesting", "getUserCollection - ERROR: $t")
            }

            })


 */

/*
        val service = BggServiceFactory.getCollectionObservableService()
        val requests = ArrayList<Observable<*>>()

        val user = "Babanel"

        requests.add(service.getCollection(user, 0, "boardgameexpansion", 0, 1))

    // Zip all requests with the Function, which will receive the results.
    Observable.zip(
        requests,
        object : Function<Array<Any?>?, Any?>() {
            @Throws(Exception::class)
            fun apply(objects: Array<Any?>?): Any? {
                // Objects[] is an array of combined results of completed requests

                // do something with those results and emit new event
                return Any()
            }
        }) // After all requests had been performed the next observer will receive the Object, returned from Function
        .subscribe( // Will be triggered if all requests will end successfully (4xx and 5xx also are successful requests too)
            object : Consumer<Any?> {
                @Throws(Exception::class)
                override fun accept(o: Any?) {
                    //Do something on successful completion of all requests
                }
            },  // Will be triggered if any error during requests will happen
            object : Consumer<Throwable?> {
                @Throws(Exception::class)
                override fun accept(e: Throwable?) {
                    //Do something on error completion of requests
                }
            }
        )
}


 */

    /**
     * Testing for Videos Service
     */
   // val geekdoFileService = GeekdoServiceFactory.getFilesService()
   // val files = geekdoFileService.getFile(291457).execute().body()
  //  println(files)

    val geekdoService = GeekdoServiceFactory.getVideosService()
    val videos = geekdoService.getVideos(291457).execute().body()
    if (videos != null) {
        println("${videos.videos.map { it.videohost }} ")
    }


}
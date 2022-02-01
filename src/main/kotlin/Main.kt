
import it.heptartle.kbgg.domain.bgg.UserCollection
import it.heptartle.kbgg.factory.BggServiceFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


fun main() {
/*
    val service = BggServiceFactory.getSearchService()
    val body = service.search("feast for odin").execute().body()
    println(body!!)



    val geekdoService = GeekdoServiceFactory.getImageService()
    val images = geekdoService.getImages(291457).execute().body()
    println(images)


    var collection = mutableListOf<String?>()

    val service = BggServiceFactory.getCollectionService()

    service.getCollection("babanel", excludesubtype = "boardgameexpansion", stats = 1, own = 1)
        .enqueue(object: Callback<UserCollection> {
            override fun onResponse(
                call: Call<UserCollection>,
                response: Response<UserCollection>
            ) {
                val body = response.body()
                body?.collectionItems?.forEach {
                    collection.add(it.name)
                }
                println(collection)
                println(collection.size)
            }

            override fun onFailure(call: Call<UserCollection>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

 */



}


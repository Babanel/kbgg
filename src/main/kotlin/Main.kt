
import it.heptartle.kbgg.domain.bgg.Item
import it.heptartle.kbgg.domain.bgg.Items
import it.heptartle.kbgg.domain.bgg.UserCollection
import it.heptartle.kbgg.factory.BggServiceFactory
import it.heptartle.kbgg.factory.GeekdoServiceFactory
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

    var collection = mutableListOf<Item?>()
    val items = mutableListOf( "173346", "526", "8790")
    val service = BggServiceFactory.getThingService()

    service.getThing(items.joinToString(), 1, 0, 0)
        .enqueue(object : Callback<Items?> {
            override fun onResponse(call: Call<Items?>, response: Response<Items?>) {
                val body = response.body()

                collection.addAll(body!!.items as Collection<Item>)
              collection.forEach {
                  println(it?.names?.get(0)?.value.toString())
                  println(it?.description)




              }

            }

            override fun onFailure(call: Call<Items?>, t: Throwable) {
println(t)
            }

        })






}


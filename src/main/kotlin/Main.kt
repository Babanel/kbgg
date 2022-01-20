
import it.heptartle.kbgg.factory.BggServiceFactory
import it.heptartle.kbgg.factory.GeekdoServiceFactory


fun main() {
/*
    val service = BggServiceFactory.getSearchService()
    val body = service.search("feast for odin").execute().body()
    println(body!!)


 */
    val geekdoService = GeekdoServiceFactory.getImageService()
    val images = geekdoService.getImages(291457).execute().body()
    println(images)
}


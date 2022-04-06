package it.heptartle.kbgg.domain.geekdo

import it.heptartle.kbgg.Utils.Language

data class Videos(

    val videos:List<Video>,
    val config: VideosConfig
)

data class Video(
    val videoid: String,
    val postdate: String,
    val objecttype: String,
    val objectid: String,
    val userid: String,
    val videohost: String,
    val extvideoid: String,
    val title: String,
    val languageid: String,
    val gallery: String,
    val numrecommend: String,
    val language: String,
    val numcomments: String,
    val images: VideoImages,
    val user: User,
    val duration: String,
    val href: String
)

data class VideoImages(
    val square: String,
    val thumb: String
)

data class VideosConfig(
    val endpage: Int,
    val numitems: Int,
    val languages: List<Language>
)


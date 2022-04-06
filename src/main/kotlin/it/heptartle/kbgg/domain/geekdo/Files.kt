package it.heptartle.kbgg.domain.geekdo

import it.heptartle.kbgg.Utils.Language

data class Files(val files: FilesContent,
                 val config: FilesConfig)

data class FilesContent(val list: List<File>)

data class File(val filepageid: String,
                val fileid: String,
                val filename: String,
                val size: String,
                val description: Description,
                val userid: String,
                val title: String,
                val postdate: String,
                val languageid: String,
                val numpositive: String,
                val numcomments: String,
                val href: String,
                val user: User,
                val language: String)

data class Description(val rendered: String)

data class FilesConfig(val endpage: Int,
                       val numitems: Int,
                       val languages: List<Language>)


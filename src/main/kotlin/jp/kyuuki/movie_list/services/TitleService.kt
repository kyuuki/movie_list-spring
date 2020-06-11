package jp.kyuuki.movie_list.services

import jp.kyuuki.movie_list.models.Title
import jp.kyuuki.movie_list.repositories.TitleRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TitleService {
    companion object {
        private val logger = LoggerFactory.getLogger(TitleService::class.java)
    }

    @Autowired
    lateinit var titleRepository: TitleRepository

    fun get(): List<Title> {
        return titleRepository.findAll()
    }
}
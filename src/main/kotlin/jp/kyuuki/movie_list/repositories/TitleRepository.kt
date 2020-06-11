package jp.kyuuki.movie_list.repositories

import jp.kyuuki.movie_list.models.Title
import org.springframework.data.jpa.repository.JpaRepository

interface TitleRepository: JpaRepository<Title, Int> {

}
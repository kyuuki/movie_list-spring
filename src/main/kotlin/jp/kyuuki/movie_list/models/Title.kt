package jp.kyuuki.movie_list.models

import javax.persistence.*

@Entity
@Table(name = "titles")
data class Title(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        val name: String
)
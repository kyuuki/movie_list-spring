package jp.kyuuki.movie_list

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MovieListApplication

fun main(args: Array<String>) {
	runApplication<MovieListApplication>(*args)
}

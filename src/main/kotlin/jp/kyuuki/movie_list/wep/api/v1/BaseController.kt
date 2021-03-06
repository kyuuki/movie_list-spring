package jp.kyuuki.movie_list.wep.api.v1

import javassist.NotFoundException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus

@RequestMapping("/v1")
open class BaseController {
    @ExceptionHandler(NotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleException(e: NotFoundException): Map<String, String> {
        return mapOf("message" to e.localizedMessage)
    }

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handleException(e: Exception): Map<String, String> {
        return mapOf("message" to e.localizedMessage)
    }
}
package jp.kyuuki.movie_list.wep.api.v1

import jp.kyuuki.movie_list.models.Title
import jp.kyuuki.movie_list.services.TitleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.RestController

@RestController
class TitleController: BaseController() {
    @Autowired
    lateinit var titleService: TitleService

    @RequestMapping("/titles", method = [ GET ])
    fun getTitles(): List<Title> {
        return titleService.get()
    }
}
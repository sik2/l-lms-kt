package lab.loop.lms.domain.home.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.MediaType.TEXT_HTML_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "HomeController", description = "홈 컨트롤러")
@RequestMapping(value = [""], produces = [TEXT_HTML_VALUE])
class HomeController {
    @GetMapping("/")
    fun showMain(): String {
        return "hi"
    }
}
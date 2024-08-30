package lab.loop.lms.domain.home

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("/")
    fun home(): String {
        return "hi"
    }
}
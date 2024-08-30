package lab.loop.lms.domain.member.controller

import lab.loop.lms.domain.member.service.MemberService
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
class ApiV1MemberController {
    private val memberService: MemberService? = null

    @GetMapping("/login")
    fun login() {
    }
}

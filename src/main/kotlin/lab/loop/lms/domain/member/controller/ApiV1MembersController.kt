package lab.loop.lms.domain.member.controller

import io.swagger.v3.oas.annotations.tags.Tag
import lab.loop.lms.domain.member.service.MemberService
import lombok.RequiredArgsConstructor
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members", consumes = [APPLICATION_JSON_VALUE], produces = [APPLICATION_JSON_VALUE])
@Tag(name = "ApiV1MembersController", description = "회원 컨트롤러")
class ApiV1MembersController {
    private val memberService: MemberService? = null

    @GetMapping("/login")
    fun login() {
    }

    @GetMapping("/logout")
    fun logout() {
    }
}

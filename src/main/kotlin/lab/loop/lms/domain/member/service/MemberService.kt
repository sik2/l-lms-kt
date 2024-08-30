package lab.loop.lms.domain.member.service

import lab.loop.lms.domain.member.repository.MemberRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@RequiredArgsConstructor
@Service
class MemberService {
    private val memberRepository: MemberRepository? = null
}

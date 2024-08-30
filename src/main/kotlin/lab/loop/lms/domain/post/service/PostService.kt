package lab.loop.lms.domain.post.service

import lab.loop.lms.domain.post.repository.PostRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@RequiredArgsConstructor
@Service
class PostService {
    private val postRepository: PostRepository? = null
}

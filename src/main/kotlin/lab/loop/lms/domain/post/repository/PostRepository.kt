package lab.loop.lms.domain.post.repository

import lab.loop.lms.domain.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : JpaRepository<Post?, Long?>

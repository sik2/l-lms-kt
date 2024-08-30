package lab.loop.lms.domain.post.controller

import io.swagger.v3.oas.annotations.tags.Tag
import lombok.RequiredArgsConstructor
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.*

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts", consumes = [APPLICATION_JSON_VALUE], produces = [APPLICATION_JSON_VALUE])
@Tag(name = "ApiV1PostsController", description = "게시물 CRUD 컨트롤러")
class ApiV1PostsController {
    @GetMapping("")
    fun getPostList(): String {
        return ""
    }

    @GetMapping("/{id}")
    fun getPost(@PathVariable id: String): String {
        return ""
    }

    @PostMapping("")
    fun createPost(): String {
        return ""
    }

    @PatchMapping("/{id}")
    fun updatePost(@PathVariable id: String): String {
        return ""
    }

    @DeleteMapping("/{id}")
    fun deletePost(@PathVariable id: String): String {
        return ""
    }
}

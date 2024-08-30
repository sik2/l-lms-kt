package lab.loop.lms.domain.urlShortener.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import lab.loop.lms.global.jpa.BaseEntity
import lombok.*
import lombok.experimental.SuperBuilder

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
class Url : BaseEntity() {
    @Column(columnDefinition = "TEXT")
    private var originUrl: String? = null

    private val shortUrl: String? = null

    private val redirectCount = 0L

    private val isActive = true
}

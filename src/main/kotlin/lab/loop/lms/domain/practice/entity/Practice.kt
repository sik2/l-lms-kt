package lab.loop.lms.domain.practice.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne
import lab.loop.lms.domain.member.entity.Member
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
class Practice : BaseEntity() {
    @ManyToOne
    private val member: Member? = null

    private val title: String? = null

    @Column(columnDefinition = "TEXT")
    private var content: String? = null

    private val langType: String? = null

    private val isPublic = false
}
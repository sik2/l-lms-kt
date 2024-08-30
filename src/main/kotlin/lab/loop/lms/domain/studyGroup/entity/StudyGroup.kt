package lab.loop.lms.domain.studyGroup.entity

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
class StudyGroup : BaseEntity() {
    @ManyToOne
    private val member: Member? = null

    private val name: String? = null

    @Column(columnDefinition = "TEXT")
    private var description: String? = null

    private val isPublic = false
}



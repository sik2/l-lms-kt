package lab.loop.lms.domain.studyGroup.entity

import jakarta.persistence.*
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
class GroupMember : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @ManyToOne
    private val studyGroup: StudyGroup? = null

    @ManyToOne
    private val member: Member? = null

    private val level: Int? = null

    @Enumerated(EnumType.STRING)
    private val isInvited: InvitationStatus? = null

    private val isBanned = false

    enum class InvitationStatus {
        INVITED, NOT_INVITED
    }
}

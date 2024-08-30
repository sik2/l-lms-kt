package lab.loop.lms.domain.member.entity

import com.fasterxml.jackson.annotation.JsonIgnore
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
class Member : BaseEntity() {
    @Column(unique = true)
    private val username: String? = null
    @JsonIgnore
    private val password: String? = null
    private val nickname: String? = null
    private val level = 0
    private val email: String? = null
    private val refreshToken: String? = null
}


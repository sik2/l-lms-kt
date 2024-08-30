package lab.loop.lms.global.springDoc

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
@OpenAPIDefinition(info = Info(title = "LMS API", version = "v1"))
class SpringDocConfig  {
    @Bean
    fun apiGroupV1(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("API V1")
            .pathsToMatch("/api/v1/**")
            .build()
    }
}

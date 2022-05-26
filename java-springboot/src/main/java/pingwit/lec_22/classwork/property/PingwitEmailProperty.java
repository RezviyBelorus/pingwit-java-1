package pingwit.lec_22.classwork.property;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@ConfigurationProperties(prefix = "pingwit.email.property")
@Validated
public record PingwitEmailProperty(
    String from,
    @Length(max = 100)
    @NotBlank
    String signature,
//    @Min(18)
    @Max(99)
    Integer age
) {
}

package pingwit.lec_22.classwork.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.mail")
public record EmailPropertyRecord(String host, Integer port, String username, String password) {

}

package pingwit.lec_22.classwork.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "spring.mail")
@ConstructorBinding
public class EmailPropertyConstructorBinding {

    private final String host;
    private final Integer port;
    private final String username;
    private final String password;

    public EmailPropertyConstructorBinding(String host, Integer port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

package pingwit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pingwit.lec_22.classwork.property.EmailProperty;
import pingwit.lec_22.classwork.property.EmailPropertyConstructorBinding;
import pingwit.lec_22.classwork.property.EmailPropertyRecord;
import pingwit.lec_22.classwork.property.PingwitEmailProperty;

@SpringBootApplication
@EnableConfigurationProperties({
    EmailProperty.class,
    EmailPropertyConstructorBinding.class,
    EmailPropertyRecord.class,
    PingwitEmailProperty.class
})
public class JavaSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringbootApplication.class, args);
    }

}

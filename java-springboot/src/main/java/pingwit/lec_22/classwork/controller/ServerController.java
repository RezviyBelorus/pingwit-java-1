package pingwit.lec_22.classwork.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_22.classwork.property.EmailProperty;
import pingwit.lec_22.classwork.property.EmailPropertyConstructorBinding;
import pingwit.lec_22.classwork.property.EmailPropertyRecord;

@RestController
@RequestMapping("/server")
public class ServerController {

//    @Value("${pingwit.server.name}")
    private final String serverName;
    private final Integer port;
    private final EmailProperty emailProperty;
    private final EmailPropertyConstructorBinding emailPropertyConstructorBinding;
    private final EmailPropertyRecord emailPropertyRecord;

    public ServerController(
        @Value("${pingwit.server.name}") String serverName,
        @Value("${pingwit.server.port}") Integer port,
        EmailProperty emailProperty,
        EmailPropertyConstructorBinding emailPropertyConstructorBinding,
        EmailPropertyRecord emailPropertyRecord
    ) {
        this.serverName = serverName;
        this.port = port;
        this.emailProperty = emailProperty;
        this.emailPropertyConstructorBinding = emailPropertyConstructorBinding;
        this.emailPropertyRecord = emailPropertyRecord;
    }

    @GetMapping("/name")
    public String serverName() {
        return serverName;
    }
}

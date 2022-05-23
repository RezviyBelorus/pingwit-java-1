package pingwit.lec_22.classwork.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_22.classwork.dto.PingwitEmailDto;
import pingwit.lec_22.classwork.service.PingwitEmailService;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final PingwitEmailService emailService;

    public EmailController(PingwitEmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public void sendEmail(@RequestBody PingwitEmailDto dto) {
        emailService.sendEmail(dto);
    }

}

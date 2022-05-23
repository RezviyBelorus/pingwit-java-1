package pingwit.lec_22.classwork.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import pingwit.lec_22.classwork.dto.PingwitEmailDto;
import pingwit.lec_22.classwork.property.PingwitEmailProperty;

@Service
public class PingwitEmailService {

    private final JavaMailSender javaMailSender;
    private final PingwitEmailProperty emailProperty;

    public PingwitEmailService(JavaMailSender javaMailSender, PingwitEmailProperty emailProperty) {
        this.javaMailSender = javaMailSender;
        this.emailProperty = emailProperty;
    }

    public void sendEmail(PingwitEmailDto pingwitEmail) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(emailProperty.from());
        message.setTo(pingwitEmail.to());
        message.setSubject(pingwitEmail.subject());
        message.setText(pingwitEmail.text() + emailProperty.signature());

        javaMailSender.send(message);
    }

}

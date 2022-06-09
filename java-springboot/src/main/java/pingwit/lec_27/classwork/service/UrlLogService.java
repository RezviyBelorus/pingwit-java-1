package pingwit.lec_27.classwork.service;

import org.springframework.stereotype.Service;
import pingwit.lec_27.classwork.entity.UrlLog;
import pingwit.lec_27.classwork.repository.UrlLogRepository;

import java.time.LocalDateTime;

@Service
public class UrlLogService {

    private final UrlLogRepository urlLogRepository;

    public UrlLogService(UrlLogRepository urlLogRepository) {
        this.urlLogRepository = urlLogRepository;
    }

    public void save(String requestURI) {
        UrlLog urlLog = new UrlLog();
        urlLog.setUrl(requestURI);
        urlLog.setRequestDate(LocalDateTime.now());

        urlLogRepository.save(urlLog);
    }
}

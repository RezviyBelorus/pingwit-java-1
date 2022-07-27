package pingwit.lec_31_spring_boot_dispatcher_servlet.service;

import org.springframework.stereotype.Service;

public class CheburashkaService {

    private final EgorkaConverter egorkaConverter;

    public CheburashkaService(EgorkaConverter egorkaConverter) {
        this.egorkaConverter = egorkaConverter;
    }

}

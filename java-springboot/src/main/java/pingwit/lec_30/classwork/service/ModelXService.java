package pingwit.lec_30.classwork.service;

import org.springframework.stereotype.Service;
import pingwit.lec_30.classwork.dto.TeslaModel;

@Service
public class ModelXService implements ModelService{

    @Override
    public TeslaModel model() {
        return TeslaModel.MODEL_X;
    }

    @Override
    public String motor() {
        return "90";
    }

}

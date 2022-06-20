package pingwit.lec_30.classwork.service;

import org.springframework.stereotype.Service;
import pingwit.lec_30.classwork.dto.TeslaModel;

@Service
public class ModelSService implements ModelService{

    @Override
    public TeslaModel model() {
        return TeslaModel.MODEL_S;
    }

    @Override
    public String motor() {
        return "100D";
    }

}

package pingwit.lec_30.classwork.service;

import org.springframework.stereotype.Service;
import pingwit.lec_30.classwork.dto.TeslaModel;

@Service
public class ModelYService implements ModelService{

    @Override
    public TeslaModel model() {
        return TeslaModel.MODEL_Y;
    }

    @Override
    public String motor() {
        return "70D";
    }

}

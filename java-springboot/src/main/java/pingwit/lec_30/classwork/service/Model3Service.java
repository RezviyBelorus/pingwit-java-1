package pingwit.lec_30.classwork.service;

import org.springframework.stereotype.Service;
import pingwit.lec_30.classwork.dto.TeslaModel;

@Service
public class Model3Service implements ModelService{

    @Override
    public TeslaModel model() {
        return TeslaModel.MODEL_3;
    }

    @Override
    public String motor() {
        return "60";
    }

}

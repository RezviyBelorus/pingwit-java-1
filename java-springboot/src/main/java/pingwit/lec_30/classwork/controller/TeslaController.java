package pingwit.lec_30.classwork.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_30.classwork.dto.Tesla;
import pingwit.lec_30.classwork.dto.TeslaModel;
import pingwit.lec_30.classwork.service.ModelService;
import pingwit.lec_30.classwork.validation.BaseInfo;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tesla")
public class TeslaController {

    private final Map<Integer, Tesla> dataStore = new HashMap<>();
    private final AtomicInteger idGenerator = new AtomicInteger();

    private final Map<TeslaModel, ModelService> teslaModels;

    public TeslaController(List<ModelService> modelServices) {
        teslaModels = modelServices.stream()
            .collect(Collectors.toMap(ModelService::model, Function.identity()));

    }

    @PostMapping("/save")
    public Tesla save(@RequestBody @Validated Tesla tesla) {
        Tesla saved = new Tesla(idGenerator.getAndIncrement(), tesla.model(), tesla.motor(), tesla.vin(), tesla.wheelRadius());
        dataStore.put(saved.id(), saved);

        return saved;
    }

    @GetMapping("/motor/{model}")
    public String getMotor(@PathVariable TeslaModel model) {
        return teslaModels.get(model).motor();
    }

    @GetMapping
    public Collection<Tesla> getAll() {
        return dataStore.values();
    }

    @GetMapping("/{id}")
    public Tesla getId(@PathVariable Long id) {
        return dataStore.get(id);
    }

}

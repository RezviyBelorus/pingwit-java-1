package pingwit.lec_26.classwork.service;

import org.springframework.stereotype.Component;
import pingwit.lec_26.classwork.dto.MilkDto;
import pingwit.lec_26.classwork.dto.MilkProducerDto;
import pingwit.lec_26.classwork.entity.Milk;
import pingwit.lec_26.classwork.entity.MilkProducer;

import java.util.List;

@Component
public class MilkConverter {

    private final MilkProducerConverter milkProducerConverter;

    public MilkConverter(MilkProducerConverter milkProducerConverter) {
        this.milkProducerConverter = milkProducerConverter;
    }

    public MilkDto toFront(Milk milk) {
        List<MilkProducerDto> milkProducerDtos = milkProducerConverter.toFront(milk.getMilkProducers());

        return new MilkDto(milk.getId(), milk.getFatPercent(),  milk.getVolume(), milkProducerDtos);
    }

    public Milk toLocal(MilkDto dto) {
        Milk milk = new Milk();

        milk.setId(dto.id());
        milk.setFatPercent(dto.fatPercent());
        milk.setVolume(dto.volume());

        List<MilkProducer> milkProducers = milkProducerConverter.toLocal(milk, dto.milkProducers());
        milk.setMilkProducers(milkProducers);

        return milk;
    }
}

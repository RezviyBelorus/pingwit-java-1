package pingwit.lec_23.classwork.converter;

import org.springframework.stereotype.Component;
import pingwit.lec_23.classwork.dto.LaptopDto;
import pingwit.lec_23.classwork.entity.Laptop;

@Component
public class LaptopConverter {

    public Laptop toLocal(LaptopDto dto) {
        Laptop laptop = new Laptop();

        laptop.setProducer(dto.producer());
        laptop.setProcessor(dto.processor());
        laptop.setPrice(dto.price());

        return laptop;
    }

    public LaptopDto toFront(Laptop laptop) {
        return new LaptopDto(laptop.getId(), laptop.getProducer(), laptop.getProcessor(), laptop.getPrice());
    }

}

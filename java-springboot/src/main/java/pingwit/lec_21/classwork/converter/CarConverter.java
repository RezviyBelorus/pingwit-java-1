package pingwit.lec_21.classwork.converter;

import org.springframework.stereotype.Component;
import pingwit.lec_21.classwork.dto.CarDto;
import pingwit.lec_21.classwork.entity.Car;

// Service, Component, Repository
@Component
public class CarConverter {

    public Car convert(CarDto carDto, Long id) {
        return new Car(id, carDto.name(), carDto.number());
    }

}

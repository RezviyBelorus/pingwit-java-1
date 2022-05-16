package pingwit.lec_21.classwork.converter;

import pingwit.lec_21.classwork.dto.CarDto;
import pingwit.lec_21.classwork.entity.Car;

public class CarDtoConverter {

    private final UserConverter userConverter;

    public CarDtoConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    public CarDto convert(Car car) {
        return new CarDto(car.name(), car.number());
    }
}

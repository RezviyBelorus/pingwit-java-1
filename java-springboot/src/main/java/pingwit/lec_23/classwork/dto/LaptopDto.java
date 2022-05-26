package pingwit.lec_23.classwork.dto;

import pingwit.lec_23.classwork.entity.Processor;
import pingwit.lec_23.classwork.entity.Producer;

import java.math.BigDecimal;

public record LaptopDto(Long id, Producer producer, Processor processor, BigDecimal price) {
}

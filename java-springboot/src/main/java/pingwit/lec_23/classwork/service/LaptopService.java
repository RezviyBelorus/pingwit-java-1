package pingwit.lec_23.classwork.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pingwit.lec_23.classwork.converter.LaptopConverter;
import pingwit.lec_23.classwork.dto.LaptopDto;
import pingwit.lec_23.classwork.entity.Laptop;
import pingwit.lec_23.classwork.repository.LaptopRepository;

import java.util.List;

@Service
public class LaptopService {

    private final LaptopConverter laptopConverter;
    private final LaptopRepository laptopRepository;

    public LaptopService(LaptopConverter laptopConverter, LaptopRepository laptopRepository) {
        this.laptopConverter = laptopConverter;
        this.laptopRepository = laptopRepository;
    }

    public Long save(LaptopDto laptopDto) {
        Laptop laptop = laptopConverter.toLocal(laptopDto);

        Laptop saved = laptopRepository.save(laptop);

        return saved.getId();
    }

    public List<LaptopDto> findAll() {
        return laptopRepository.findAll().stream()
            .map(laptopConverter::toFront)
            .toList();
    }

    public Page<LaptopDto> findAllPageable(Pageable pageable) {
        return laptopRepository.findAll(pageable)
            .map(laptopConverter::toFront);
    }
}

package pingwit.lec_23.classwork.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_23.classwork.dto.LaptopDto;
import pingwit.lec_23.classwork.service.LaptopService;

import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @PostMapping("/save")
    public Long save(@RequestBody LaptopDto laptopDto) {
        return laptopService.save(laptopDto);
    }

    @GetMapping("/all")
    public List<LaptopDto> getAll() {
        return laptopService.findAll();
    }

    @GetMapping("/all/page")
    public Page<LaptopDto> getAllPageable(@RequestParam int page, @RequestParam int size) {
        return laptopService.findAllPageable(PageRequest.of(page, size));
    }
}

package pingwit.lec_26.classwork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_26.classwork.dto.MilkDto;
import pingwit.lec_26.classwork.service.MilkService;

import java.nio.file.AccessDeniedException;

@RestController
@RequestMapping("/milk")
public class MilkController {

    private final MilkService milkService;

    public MilkController(MilkService milkService) {
        this.milkService = milkService;
    }

    @PostMapping("/save")
    public Long save(@RequestBody MilkDto dto) {
        return milkService.save(dto);
    }

    @PutMapping("/update")
    public Long update(@RequestBody MilkDto dto) {
        return milkService.update(dto);
    }

    @GetMapping("/id/{id}")
    public MilkDto getById(@PathVariable Long id) {
        return milkService.getById(id);
    }

    @GetMapping("/id/broken/{id}")
    public MilkDto getByIdBroken(@PathVariable Long id) throws AccessDeniedException {
        return milkService.getByIdBroken(id);
    }

}

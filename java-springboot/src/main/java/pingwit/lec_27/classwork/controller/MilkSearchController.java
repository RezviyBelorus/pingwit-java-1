package pingwit.lec_27.classwork.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_26.classwork.dto.MilkDto;
import pingwit.lec_27.classwork.repository.MilkSearchRepository;

import java.util.List;

@RestController
@RequestMapping("/milk/search")
public class MilkSearchController {

    private final MilkSearchRepository milkSearchRepository;

    public MilkSearchController(MilkSearchRepository milkSearchRepository) {
        this.milkSearchRepository = milkSearchRepository;
    }

    @GetMapping
    public List<MilkDto> getMilkByIdIn(@RequestParam List<Long> ids) {
        return milkSearchRepository.getMilkByIdIn(ids);
    }

    @GetMapping("/body")
    public ResponseEntity<List<MilkDto>> getMilkByIdInBody(@RequestParam List<Long> ids) {
        ResponseEntity<List<MilkDto>> ok = ResponseEntity.status(HttpStatus.OK)
            .header("Custom", "666")
            .body(milkSearchRepository.getMilkByIdIn(ids));

        return ok;
    }

}

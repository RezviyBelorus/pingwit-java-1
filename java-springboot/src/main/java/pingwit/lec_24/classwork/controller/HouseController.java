package pingwit.lec_24.classwork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_24.classwork.dto.HouseDto;
import pingwit.lec_24.classwork.entity.HouseType;
import pingwit.lec_24.classwork.service.HouseService;

import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {

    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @PostMapping("/save")
    public Long save(@RequestBody HouseDto dto) throws Exception {
        return houseService.save(dto);
    }

    @GetMapping("/type/{houseType}")
    public List<HouseDto> findAllByHouseType(@PathVariable HouseType houseType) {
        return houseService.findAllByHouseType(houseType);
    }

    @GetMapping("/search")
    public List<HouseDto> findAllByHouseType(@RequestParam HouseType houseType, @RequestParam List<Long> ids) {
        return houseService.findAllByHouseTypeAndIdIn(houseType, ids);
    }

    @GetMapping("/search/floor/{floor}")
    public List<HouseDto> findAllByFloorGreaterThanOrderByIdDesc(@PathVariable Integer floor) {
        return houseService.findAllByFloorGreaterThanOrderByIdDesc(floor);
    }

}

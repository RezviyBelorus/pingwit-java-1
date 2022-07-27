package pingwit.lec_31_spring_boot_dispatcher_servlet.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_31_spring_boot_dispatcher_servlet.repository.Cosmetic;

@RestController
@RequestMapping("/cosmetic")
public class CosmeticController {


    @PostMapping("/save")
    public String save(Cosmetic cosmetic) {

        return "cosmetic was saved";
    }
}

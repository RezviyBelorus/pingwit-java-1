package pingwit.lec_31_spring_boot_dispatcher_servlet.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cosmetic")
public class CosmeticController_V2 {

    @PostMapping("/save/v2")
    public String save() {
        return "cosmetic was saved V2";
    }
}

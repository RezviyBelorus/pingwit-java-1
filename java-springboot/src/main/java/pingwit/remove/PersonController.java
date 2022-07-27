package pingwit.remove;

import org.springframework.stereotype.Service;

import java.util.Optional;
import javax.annotation.PostConstruct;

@Service
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostConstruct
    public void findById() {
        CosmetologyPerson byId = personService.findById(1L);
    }

}

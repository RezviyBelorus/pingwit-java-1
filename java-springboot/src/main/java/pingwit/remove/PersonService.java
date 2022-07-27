package pingwit.remove;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import javax.annotation.PostConstruct;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostConstruct
    @Transactional
    public void init() {
        List<CosmetologyPerson> byOrderId = findByOrderId(1L);
        List<CosmetologyPerson> byOrderIds = findByOrdersIn(List.of(1L, 2L));
    }

    public List<CosmetologyPerson> findByOrderId(Long id) {
        List<CosmetologyPerson> byOrdersIn = personRepository.findByOrder(1L);

        return byOrdersIn;
    }

    public List<CosmetologyPerson> findByOrdersIn(List<Long> ids) {
        List<CosmetologyPerson> byOrdersIn = personRepository.findByOrdersIn(ids);

        return byOrdersIn;
    }

    @Transactional
    public CosmetologyPerson findById(Long id) {
        Optional<CosmetologyPerson> byId = personRepository.findById(id);

        return byId
            .orElse(null);
    }
}

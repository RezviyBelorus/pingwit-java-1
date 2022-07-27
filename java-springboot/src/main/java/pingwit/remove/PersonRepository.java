package pingwit.remove;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<CosmetologyPerson, Long> {

    @Query(
        "SELECT p from CosmetologyPerson p " +
            "JOIN FETCH p.orders o " +
            "WHERE o.id = :order"
    )
    List<CosmetologyPerson> findByOrder(Long order);

    @Query(
        "SELECT DISTINCT p from CosmetologyPerson p " +
            "JOIN FETCH p.orders o " +
            "WHERE o.id IN :orders"
    )
    List<CosmetologyPerson> findByOrdersIn(List<Long> orders);

}

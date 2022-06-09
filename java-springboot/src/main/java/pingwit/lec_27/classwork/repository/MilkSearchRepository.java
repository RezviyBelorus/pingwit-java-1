package pingwit.lec_27.classwork.repository;

import org.springframework.stereotype.Repository;
import pingwit.lec_26.classwork.dto.MilkDto;
import pingwit.lec_26.classwork.entity.Milk;
import pingwit.lec_26.classwork.service.MilkConverter;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Repository
public class MilkSearchRepository {

    private final EntityManager entityManager;
    private final MilkConverter milkConverter;

    public MilkSearchRepository(EntityManager entityManager, MilkConverter milkConverter) {
        this.entityManager = entityManager;
        this.milkConverter = milkConverter;
    }

    public List<MilkDto> getMilkByIdIn(List<Long> ids) {
        TypedQuery<Milk> query = entityManager.createQuery(
            """
                SELECT m FROM Milk m
                LEFT JOIN FETCH m.milkProducers
                WHERE m.id IN :ids
                    """, Milk.class
        );

        query.setParameter("ids", ids);

        return query.getResultList().stream()
            .map(milkConverter::toFront)
            .toList();
    }

}

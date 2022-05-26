package pingwit.lec_23.classwork.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pingwit.lec_23.classwork.entity.Laptop;

import java.util.List;

public interface LaptopRepository extends PagingAndSortingRepository<Laptop, Long> {

    List<Laptop> findAll();
}

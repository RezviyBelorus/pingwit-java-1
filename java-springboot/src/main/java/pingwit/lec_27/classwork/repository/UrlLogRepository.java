package pingwit.lec_27.classwork.repository;

import org.springframework.data.repository.CrudRepository;
import pingwit.lec_27.classwork.entity.UrlLog;

public interface UrlLogRepository extends CrudRepository<UrlLog, Long> {
}

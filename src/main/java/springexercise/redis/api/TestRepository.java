package springexercise.redis.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springexercise.redis.api.InputEntity;

@Repository
public interface TestRepository extends CrudRepository<InputEntity, Long> {
}

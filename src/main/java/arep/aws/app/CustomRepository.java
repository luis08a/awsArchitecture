package arep.aws.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository
 */
@Repository
public interface CustomRepository extends CrudRepository<CustomEntity, String> {

}
package blog.repositories;

import blog.models.Check;
import blog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepository extends
        JpaRepository<Check, Long> {
}

package blog.repositories;

import blog.models.CheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckHistoryRepository extends
        JpaRepository<CheckHistory, Long> {
}

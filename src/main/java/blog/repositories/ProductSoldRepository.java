package blog.repositories;

import blog.models.ProductSold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSoldRepository extends
        JpaRepository<ProductSold, Long> {
}

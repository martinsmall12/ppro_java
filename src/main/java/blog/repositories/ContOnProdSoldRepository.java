package blog.repositories;


import blog.models.ContOnProdSold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContOnProdSoldRepository extends
        JpaRepository<ContOnProdSold, Long> {
}

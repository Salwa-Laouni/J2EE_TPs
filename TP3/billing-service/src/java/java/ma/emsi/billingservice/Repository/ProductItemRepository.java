package ma.emsi.billingservice.Repository;

import ma.emsi.billingservice.Entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem,Long>
{
    List<ProductItem> findByBillId(Long billID);
}

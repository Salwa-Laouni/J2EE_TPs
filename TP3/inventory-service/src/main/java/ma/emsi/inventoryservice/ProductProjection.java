package ma.emsi.inventoryservice;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullProduct", types = Product.class)
interface ProductProjection extends Projection{
    Long getId(); // Ensure `id` is included
    String getName();
    Double getPrice();
    // Add other fields as needed
}

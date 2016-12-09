package blog.models;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ProductsSold")
public class ProductSold {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String serialNumber;

    @Column(length = 20)
    private Date dateOfSale;

    @OneToMany(mappedBy = "productSold")
    private Set<Product> products = new HashSet<>();

    @OneToMany(mappedBy = "productSold")
    private Set<Customer> customers = new HashSet<>();

}

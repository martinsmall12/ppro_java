package blog.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    private String name;

    @Column(length = 500)
    private String shortDescription;

    @Column(length = 1000)
    private String longDescription;

    @Column(length = 30)
    private String price;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ProductSold productSold;


    public Product(String name, String shortDescription, String longDescription, String price) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ProductSold getProductSold() {
        return productSold;
    }

    public void setProductSold(ProductSold productSold) {
        this.productSold = productSold;
    }
}

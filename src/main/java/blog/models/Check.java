package blog.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "checks")
public class Check {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    private String name;

    @Column(length = 1000)
    private String consequences;

    @Column(length = 50)
    private String price;

    @Column(length = 30)
    private String period;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "check")
    private Set<ContOnProdSold> contOnProdSolds;

    public Check(String name, String consequences, String price, String period) {
        this.name = name;
        this.consequences = consequences;
        this.price = price;
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConsequences() {
        return consequences;
    }

    public void setConsequences(String consequences) {
        this.consequences = consequences;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}

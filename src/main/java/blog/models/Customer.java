package blog.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    private String ico;

    @Column(length = 30, unique = true)
    private String dic;

    @Column(length = 100)
    private String company;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String street;

    @Column(length = 100)
    private String city;

    @Column(length = 100)
    private String state;

    @Column(length = 5)
    private String psc;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String phone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<ProductSold> productSolds;

    public Customer(String ico, String dic, String company, String name, String street, String city, String state, String psc, String email, String phone) {
        this.ico = ico;
        this.dic = dic;
        this.company = company;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.psc = psc;
        this.email = email;
        this.phone = phone;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getDic() {
        return dic;
    }

    public void setDic(String dic) {
        this.dic = dic;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<ProductSold> getProductSolds() {
        return productSolds;
    }

    public void setProductSolds(Set<ProductSold> productSolds) {
        this.productSolds = productSolds;
    }
}

package blog.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ContOnProdSold")
public class ContOnProdSold {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "check_id")
    private Check check;

    @ManyToOne
    @JoinColumn(name = "checkHistory_id")
    private CheckHistory checkHistory;


    @ManyToOne
    @JoinColumn(name = "productSold_id")
    private ProductSold productSold;


    public ContOnProdSold(Check check, CheckHistory checkHistory, ProductSold productSold) {
        this.check = check;
        this.checkHistory = checkHistory;
        this.productSold = productSold;
    }

    public ContOnProdSold() {
    }

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }

    public CheckHistory getCheckHistory() {
        return checkHistory;
    }

    public void setCheckHistory(CheckHistory checkHistory) {
        this.checkHistory = checkHistory;
    }

    public ProductSold getProductSold() {
        return productSold;
    }

    public void setProductSold(ProductSold productSold) {
        this.productSold = productSold;
    }
}

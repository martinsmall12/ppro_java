package blog.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ContOnProdSold")
public class ContOnProdSold {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
    @ManyToOne
    @JoinColumn(name = "productSold_id")
    private ProductSold productSold;
    */

    @ManyToOne
    @JoinColumn(name = "check_id")
    private Check check;

    @ManyToOne
    @JoinColumn(name = "checkHistory_id")
    private CheckHistory checkHistory;

    public ContOnProdSold(Check check, CheckHistory checkHistory) {
        this.check = check;
        this.checkHistory = checkHistory;
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
}

package blog.forms;


import blog.models.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

public class ContOnProdSoldForm {


    private List<Check> checks;

    private List<CheckHistory> checkHistories;

    private List<ProductSold> productSolds;

    public List<Check> getChecks() {
        return checks;
    }

    public void setChecks(List<Check> checks) {
        this.checks = checks;
    }

    public List<CheckHistory> getCheckHistories() {
        return checkHistories;
    }

    public void setCheckHistories(List<CheckHistory> checkHistories) {
        this.checkHistories = checkHistories;
    }

    public List<ProductSold> getProductSolds() {
        return productSolds;
    }

    public void setProductSolds(List<ProductSold> productSolds) {
        this.productSolds = productSolds;
    }
}

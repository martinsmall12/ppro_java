package blog.forms;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CheckForm {


    @Size(min = 30)
    private String name;

    @Size(min = 1000)
    private String consequences;

    @Size(min = 50)
    private String price;

    @Size(min = 30)
    private String period;

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

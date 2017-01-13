package blog.forms;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CheckForm {


    @Size(max = 30)
    private String name;

    @Size(max = 1000)
    private String consequences;

    @Size(max = 50)
    private String price;

    @Size(max = 30)
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

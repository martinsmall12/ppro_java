package blog.forms;


import javax.validation.constraints.Size;

public class ProductForm {

    @Size(min = 30)
    private String name;

    @Size(min = 500)
    private String shortDescription;

    @Size(min = 1000)
    private String longDescription;

    @Size(min = 30)
    private String price;

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
}

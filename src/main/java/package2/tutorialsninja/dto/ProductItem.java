package package2.tutorialsninja.dto;

public class ProductItem {
    private String name;
    private String description;
    private String oldPrice;
    private String newPrice;
    private String price;
    private String tax;

    public ProductItem() {
    }

    public ProductItem(String name, String description, String oldPrice, String newPrice, String tax) {
        this.name = name;
        this.description = description;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.tax = tax;
    }

    public ProductItem(String name, String description, String price, String tax) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public String getPrice() {
        return price;
    }

    public String getTax() {
        return tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "ProductItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", oldPrice='" + oldPrice + '\'' +
                ", newPrice='" + newPrice + '\'' +
                ", price='" + price + '\'' +
                ", tax='" + tax + '\'' +
                '}';
    }
}

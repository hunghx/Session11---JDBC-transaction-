package ra.academy.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private int stock;
    private int catalogId;

    public Product() {
    }

    public Product(String name, double price, String description, int stock, int catalogId) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.catalogId = catalogId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", catalogId=" + catalogId +
                '}';
    }
}

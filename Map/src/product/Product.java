package product;

public class Product {
   private int id;
   private String name;
   private double prince;
   private String description;

    public Product() {
    }

    public Product(int id, String name, double prince, String description) {
        this.id = id;
        this.name = name;
        this.prince = prince;
        this.description = description;
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

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ID: " + id + " || " + "Product " + name +  " || " + "Prince " +
                prince + " || " + "Description " + description;
    }
}


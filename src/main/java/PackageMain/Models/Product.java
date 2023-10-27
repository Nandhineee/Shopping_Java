package PackageMain.Models;

import java.sql.Timestamp;

public class Product {

    private Timestamp id;
    private  String title;
    private String description;

    private double price;
    private  int stock;
    private Category category;

    public Timestamp getId() {
        return id;
    }

    public void setId(Timestamp id) {
        this.id = id;
    }
}

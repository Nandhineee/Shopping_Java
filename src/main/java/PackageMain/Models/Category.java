package PackageMain.Models;

import java.sql.Timestamp;

public class Category {
    private Timestamp id;
    private String CategoryName;

    public Timestamp getId() {
        return id;
    }

    public void setId(Timestamp id) {
        this.id = id;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}

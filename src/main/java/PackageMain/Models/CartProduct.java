package PackageMain.Models;

public class CartProduct {
    private Product Product;
    private int count;

    public PackageMain.Models.Product getProduct() {
        return Product;
    }

    public void setProduct(PackageMain.Models.Product product) {
        Product = product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

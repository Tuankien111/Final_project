package tuankien.st001.e_commerceapp.Product;

public class Product {
    private int product_img;
    private String product_name;


    public Product(int product_img,String product_name) {
        this.product_img = product_img;
        this.product_name = product_name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_img() {
        return product_img;
    }

    public void setProduct_img(int product_img) {
        this.product_img = product_img;
    }

}

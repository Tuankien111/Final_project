package tuankien.st001.e_commerceapp.Category;

public class Category {
    private int img_id;
    private String category_name;

    public Category(int img_id, String category_name) {
        this.img_id = img_id;
        this.category_name = category_name;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}

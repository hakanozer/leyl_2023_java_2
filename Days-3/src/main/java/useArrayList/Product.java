package useArrayList;

public class Product {

    private int pid;
    private String title;
    private int price;

    public Product(int pid, String title, int price) {
        this.pid = pid;
        this.title = title;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

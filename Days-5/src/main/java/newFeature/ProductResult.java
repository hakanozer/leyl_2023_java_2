package newFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class ProductResult {

    public List<Product> result(int size) {
        List<Product> ls = new ArrayList<>();
        for (int i = 0; i < size; i++) {
          int price = new Random().nextInt(999999) + 1;
          String title = UUID.randomUUID().toString();
          Product p = new Product(i, title, price);
          ls.add(p);
        }
        return ls;
    }

}

package newFeature;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private int pid;
    private String title;
    private int price;

}

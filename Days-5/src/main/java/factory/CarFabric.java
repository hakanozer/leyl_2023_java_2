package factory;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class CarFabric {

    public abstract void createCar();

    public CarFabric() {
        createCar();
    }

    private List<Car> ls = new ArrayList<>();

}

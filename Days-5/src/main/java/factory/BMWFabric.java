package factory;

public class BMWFabric extends CarFabric{

    @Override
    public void createCar() {
        getLs().add( new I20(110) );
        getLs().add( new I320(140) );
    }

}

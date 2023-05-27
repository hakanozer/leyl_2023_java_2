package factory;

public class AudiFabric extends CarFabric{

    @Override
    public void createCar() {
        getLs().add( new A3(120) );
        getLs().add( new A5(150) );
    }

}

package factory;

public class MainFactory {
    public static void main(String[] args) {
        AudiFabric audiFabric = new AudiFabric();
        BMWFabric bmwFabric = new BMWFabric();

        call(audiFabric);
        call(bmwFabric);
    }

    public static void call( CarFabric carFabric ) {
        for ( Car item : carFabric.getLs() ) {
            System.out.println( item );
        }
    }

}

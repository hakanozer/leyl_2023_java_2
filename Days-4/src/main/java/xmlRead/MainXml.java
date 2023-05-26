package xmlRead;

import java.util.List;

public class MainXml {

    public static void main(String[] args) {
        XmlResult xmlResult = new XmlResult();
        List<Currency> list = xmlResult.xml();
        for ( Currency item : list ) {
            System.out.println( item.getCurrencyName() + " - " + item.getForexBuying() + " - " + item.getForexSelling() );
        }
        System.out.println( list.get(0).getForexSelling() );
        System.out.println( list.get(3).getForexSelling() );
    }


}

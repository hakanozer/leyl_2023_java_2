package xmlRead;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class XmlResult {

    public List<Currency> xml() {
        List<Currency> ls = new ArrayList<>();
        try {
            String url = "https://www.tcmb.gov.tr/kurlar/today.xml";
            String stData = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get().toString();
            Document doc = Jsoup.parse(stData, Parser.xmlParser());
            Elements elements = doc.getElementsByTag("Currency");
            for(Element item : elements) {
                String kod = item.getAllElements().attr("kod");
                String currencyName = item.getElementsByTag("CurrencyName").text();
                String forexBuying = item.getElementsByTag("ForexBuying").text();
                String forexSelling = item.getElementsByTag("ForexSelling").text();
                Currency c = new Currency(kod, currencyName, forexBuying, forexSelling);
                ls.add(c);
            }
        }catch (Exception ex) {
            System.err.println("Xml Error :" + ex);
        }
        return ls;
    }

    public Currency getKod( String kod ) {
        List<Currency> list = xml();
        Currency c = null;
        for ( Currency item : list ) {
            if ( item.getKod().toLowerCase().equals(kod.toLowerCase()) ) {
               c = item;
               break;
            }
        }
        return c;
    }

}

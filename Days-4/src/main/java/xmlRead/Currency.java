package xmlRead;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Currency {

    private String currencyName;
    private String forexBuying;
    private String forexSelling;

}

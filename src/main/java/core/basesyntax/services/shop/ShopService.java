package core.basesyntax.services.shop;

import core.basesyntax.services.FruitTransaction;
import java.util.List;

public interface ShopService {
    void process(List<FruitTransaction> transactions);
}

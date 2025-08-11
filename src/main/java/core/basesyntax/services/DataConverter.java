package core.basesyntax.services;

import java.util.List;

public interface DataConverter {
    List<FruitTransaction> convertToTransaction(List<String> listOfReport);
}

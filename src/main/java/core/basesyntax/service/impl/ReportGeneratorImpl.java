package core.basesyntax.service.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.service.ReportGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class ReportGeneratorImpl implements ReportGenerator {

    private final String HEADER = "fruit,quantity";
    private final String SEPARATOR = ",";

    @Override
    public String getReport() {
        List<String> result = new ArrayList<>();
        result.add(HEADER);
        result.addAll(Storage.getShopStorage().entrySet().stream()
                .map(e -> e.getKey() + SEPARATOR + e.getValue())
                .toList());
        return String.join(System.lineSeparator(), result);
    }
}

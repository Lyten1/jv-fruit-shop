package core.basesyntax.service.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.service.ReportGenerator;
import java.util.ArrayList;
import java.util.List;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String getReport() {
        List<String> result = new ArrayList<>();
        result.add("fruit,quantity");
        result.addAll(Storage.getShopStorage().entrySet().stream()
                .map(e -> e.getKey() + "," + e.getValue())
                .toList());
        return String.join("\n", result);
    }
}

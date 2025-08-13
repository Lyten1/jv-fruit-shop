package core.basesyntax.service.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.service.ReportGenerator;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

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

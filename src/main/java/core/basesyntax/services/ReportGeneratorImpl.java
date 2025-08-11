package core.basesyntax.services;

import core.basesyntax.services.shop.Storage;
import java.util.stream.Collectors;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String getReport(Storage storage) {
        return storage.getShopStorage().entrySet().stream()
                .map(e -> "" + e.getKey() + "," + e.getValue())
                .collect(Collectors.joining("\n"));
    }
}

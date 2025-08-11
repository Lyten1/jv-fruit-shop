package core.basesyntax.services;

import core.basesyntax.services.shop.Storage;

public interface ReportGenerator {
    String getReport(Storage storage);
}

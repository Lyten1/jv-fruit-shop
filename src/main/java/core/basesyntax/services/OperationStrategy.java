package core.basesyntax.services;

import core.basesyntax.services.operations.OperationHandler;

public interface OperationStrategy {
    OperationHandler get(FruitTransaction.Operation operation);
}

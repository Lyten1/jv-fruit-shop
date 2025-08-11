package core.basesyntax.services.shop;

import core.basesyntax.services.FruitTransaction;
import core.basesyntax.services.OperationStrategy;
import core.basesyntax.services.operations.OperationHandler;
import java.util.List;

public class ShopServiceImpl implements ShopService {
    private OperationStrategy operationStrategy;
    private Storage storage;

    public ShopServiceImpl(OperationStrategy operationStrategy, Storage storage) {
        this.operationStrategy = operationStrategy;
        this.storage = storage;
    }

    @Override
    public void process(List<FruitTransaction> transactions) {
        for (FruitTransaction transaction : transactions) {
            OperationHandler currentOperation = operationStrategy.get(transaction.getOperation());
            int stock = currentOperation.getStock(transaction.getQuantity());
            storage.updateStorage(transaction.getFruit(), stock);
        }
    }
}

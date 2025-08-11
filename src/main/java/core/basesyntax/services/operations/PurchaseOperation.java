package core.basesyntax.services.operations;

public class PurchaseOperation implements OperationHandler {
    @Override
    public int getStock(int amount) {
        return -amount;
    }
}

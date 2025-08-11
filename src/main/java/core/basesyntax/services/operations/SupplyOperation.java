package core.basesyntax.services.operations;

public class SupplyOperation implements OperationHandler {
    @Override
    public int getStock(int amount) {
        return amount;
    }
}

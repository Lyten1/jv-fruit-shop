package core.basesyntax.services.operations;

public class BalanceOperation implements OperationHandler {
    @Override
    public int getStock(int amount) {
        return amount;
    }
}

package core.basesyntax.services.operations;

public class ReturnOperation implements OperationHandler {
    @Override
    public int getStock(int amount) {
        return amount;
    }
}

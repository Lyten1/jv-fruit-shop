package core.basesyntax.services;

import java.util.List;

public class DataConverterImpl implements DataConverter {
    @Override
    public List<FruitTransaction> convertToTransaction(List<String> listOfReport) {
        return listOfReport.stream()
                .map(this::getFruitTransaction)
                .toList();
    }

    private FruitTransaction getFruitTransaction(String record) {
        FruitTransaction fruitTransaction = new FruitTransaction();
        String[] data = record.split(",");
        fruitTransaction.setOperation(FruitTransaction.Operation.fromCode(data[0]));
        fruitTransaction.setFruit(data[1]);
        fruitTransaction.setQuantity(Integer.parseInt(data[2]));
        return fruitTransaction;
    }
}

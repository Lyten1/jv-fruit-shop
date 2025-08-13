package core.basesyntax.service.impl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.DataConverter;
import java.util.List;

public class DataConverterImpl implements DataConverter {
    @Override
    public List<FruitTransaction> convertToTransaction(List<String> listOfReport) {
        if (listOfReport == null) {
            throw new IllegalArgumentException("list of input data must not be null");
        }
        return listOfReport.stream()
                .skip(1)
                .map(this::getFruitTransaction)
                .toList();
    }

    private FruitTransaction getFruitTransaction(String record) {
        FruitTransaction fruitTransaction = new FruitTransaction();
        String[] data = record.split(",");
        if (data.length != 3) {
            throw new RuntimeException(
                    "Input file data in wrong format, every row must have 3 parameters");
        }
        fruitTransaction.setOperation(FruitTransaction.Operation.fromCode(data[0]));
        fruitTransaction.setFruit(data[1]);
        int quantity;
        if ((quantity = Integer.parseInt(data[2])) < 0) {
            throw new RuntimeException("Negative quantity not allowed: " + record);
        }
        fruitTransaction.setQuantity(quantity);
        return fruitTransaction;
    }
}

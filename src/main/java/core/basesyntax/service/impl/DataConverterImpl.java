package core.basesyntax.service.impl;

import core.basesyntax.service.DataConverter;
import core.basesyntax.model.FruitTransaction;

import java.util.List;

public class DataConverterImpl implements DataConverter {
    @Override
    public List<FruitTransaction> convertToTransaction(List<String> listOfReport) {
        return listOfReport.stream()
                .skip(1)
                .map(this::getFruitTransaction)
                .toList();
    }

    private FruitTransaction getFruitTransaction(String record) {
        FruitTransaction fruitTransaction = new FruitTransaction();
        String[] data = record.split(",");
        if (data.length != 3) {
            throw new RuntimeException("Input file data in wrong format, every row must have 3 parameters");
        }
        fruitTransaction.setOperation(FruitTransaction.Operation.fromCode(data[0]));
        fruitTransaction.setFruit(data[1]);
        fruitTransaction.setQuantity(Integer.parseInt(data[2]));
        return fruitTransaction;
    }
}

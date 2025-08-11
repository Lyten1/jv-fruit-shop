package core.basesyntax.services.shop;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private Map<String, Integer> shopStorage = new HashMap<>();

    public Map<String, Integer> getShopStorage() {
        return shopStorage;
    }

    public void updateStorage(String fruit, int amount) {
        if (shopStorage.containsKey(fruit)) {
            shopStorage.put(fruit, shopStorage.get(fruit) + amount);
        } else {
            shopStorage.put(fruit, amount);
        }
    }
}

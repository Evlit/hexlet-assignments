package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage data) {
        Map<String, String> storages = new HashMap<>(data.toMap());
        for (Map.Entry<String, String> change : storages.entrySet()) {
            data.unset(change.getKey());
            data.set(change.getValue(), change.getKey());
        }
    }
}
// END

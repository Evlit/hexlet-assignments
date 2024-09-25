package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> storage;

    public InMemoryKV(Map<String, String> storage) {
        this.storage =  new HashMap<>(storage);
    }

    public Map<String, String> getStorage() {
        return storage;
    }

    @Override
    public void set(String key, String value) {
        getStorage().put(key, value);
    }

    @Override
    public String get(String key, String defaultValue) {
        String result = getStorage().get(key) == null ? defaultValue : getStorage().get(key);
        return result;
    }

    @Override
    public void unset(String key) {
        getStorage().remove(key);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(getStorage());
    }
}
// END

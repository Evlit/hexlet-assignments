package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String tagName;
    private Map<String, String> tagAtr;

    public Tag(String tagName, Map<String, String> tagAtr) {
        this.tagName = tagName;
        this.tagAtr = tagAtr;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Map<String, String> getTagAtr() {
        return tagAtr;
    }

    public void setTagAtr(Map<String, String> tagAtr) {
        this.tagAtr = tagAtr;
    }

    @Override
    public String toString() {
        return tagAtr.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + "\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(" "));
    }
}
// END

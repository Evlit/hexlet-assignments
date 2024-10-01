package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String tagName, Map<String, String> tagAtr) {
        super(tagName, tagAtr);
    }
    @Override
    public String toString() {
        return getTagAtr().isEmpty() ? "<" + getTagName() + ">" : "<" + getTagName() + " " + super.toString() + ">";
    }
}
// END

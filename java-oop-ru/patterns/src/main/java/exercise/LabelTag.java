package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String tagName;
    private TagInterface objectTag;

    public LabelTag(String tagName, TagInterface objectTag) {
        this.tagName = tagName;
        this.objectTag = objectTag;
    }

    public String render() {
        return "<label>" + tagName + objectTag.render() + "</label>";
    }
}
// END

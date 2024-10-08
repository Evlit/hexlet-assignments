package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> children;


    public PairedTag(String tagName, Map<String, String> attributes, String tagBody, List<Tag> children) {
        super(tagName, attributes);
        this.tagBody = tagBody;
        this.children = children;
    }

    public String getTagBody() {
        return tagBody;
    }

    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    public List<Tag> getChildren() {
        return children;
    }

    public void setChildren(List<Tag> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < children.size(); i++) {
            sb.append(children.get(i).toString());
        }
        if(getTagAtr().isEmpty())
            return "<" + getTagName()
                    + super.toString()
                    + ">"
                    + getTagBody()
                    + sb
                    + "</"
                    + getTagName()
                    + ">";
        return "<" + getTagName()
                + " "
                + super.toString()
                + ">"
                + getTagBody()
                + sb
                + "</"
                + getTagName()
                + ">";
    }
}
// END

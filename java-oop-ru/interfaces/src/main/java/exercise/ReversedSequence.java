package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String text;

    public ReversedSequence(String text) {
        this.text = text;
    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(text.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new ReversedSequence(text.substring(start + 1, end + 1));
    }

    public String toString() {
        char[] array = text.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }
}
// END

public class Shifter implements CharSequence{
    private String text;

    public Shifter(String text, int shift) {
        this.text = text.substring(shift);
    }

    public String getText() {
        return text;
    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return text.subSequence(start, end);
    }
}

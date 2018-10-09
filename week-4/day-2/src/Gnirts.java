public class Gnirts implements CharSequence {

    private String text;

    public Gnirts(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(this.length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
    String toReturn = "";
        for (int i = start; i < end ; i++) {
            toReturn+=text.charAt(this.length()-1-i);
        }
        return toReturn;

    }
}

public class main {
    public static void main(String[] args) {
        Gnirts text = new Gnirts("poklop");
        System.out.println(text.charAt(2));
        System.out.println(text.subSequence(1, 5));

        Shifter text1 = new Shifter("poklop", 2);
        System.out.println(text1.getText());
        System.out.println(text1.length());
        System.out.println(text1.charAt(0));
        System.out.println(text1.subSequence(0,2));
    }
}

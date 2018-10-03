public class Sharpie {

    String color;
    double width;
    double inkAmount;

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        inkAmount = 100;
    }

    public void use() {
        inkAmount--;
    }

    public static void main(String[] args) {
//        Create Sharpie class
//        We should know about each sharpie their color (which should be a string), width (which will be a floating point number),
//         inkAmount (another floating point number)
//        When creating one, we need to specify the color and the width
//        Every sharpie is created with a default 100 as inkAmount
//        We can use() the sharpie objects
//        which decreases inkAmount
        Sharpie fixa = new Sharpie("blue", 2.5);
        fixa.use();
        fixa.use();
        System.out.println(fixa.color + fixa.width + fixa.inkAmount);
    }
}

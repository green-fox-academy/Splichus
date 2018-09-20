public class Cuboid {
    public static void main(String[] args) {

        double a = 10.0;
        double b = 15.0;
        double c = 20.0;

        double surface = 2*(a*b + a*c + b*c);
        double volume = a*b*c;

        System.out.println("Surface Area: " +surface);
        System.out.println("Volume: " +volume);
    }
}

import java.awt.*;

public class Helpers {
    public static int randomNumber (int lowerIndex, int range) {
        return (int)(Math.random()*range)+lowerIndex;
    }
    public static Color randomColor () {
        Color newColor = new Color(randomNumber(0, 255), randomNumber(0, 255), randomNumber(0, 255));
        return newColor;
    }
}

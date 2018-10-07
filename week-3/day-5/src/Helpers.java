import java.awt.*;

public class Helpers {
    public static int randomNumber (int lowerIndex, int range) {
        return (int)(Math.random()*range)+lowerIndex;
    }

    public static Color randomColor () {
        return new Color(randomNumber(0, 255), randomNumber(0, 255), randomNumber(0, 255));
    }
}

import java.util.ArrayList;

public class SharpieSet {

    ArrayList<Sharpie> sharpieSet = new ArrayList<>();

    public void add (Sharpie sharpie) {
        sharpieSet.add(sharpie);
    }
    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie : sharpieSet) {
            if (sharpie.inkAmount != 0) {
                count++;
            }
        }
        return count;
    }
    public void removeTrash() {
//        for (Sharpie sharpie : sharpieSet) {
//            if (sharpie.inkAmount == 0) {
//                sharpieSet.remove()
//            }
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (sharpieSet.get(i).inkAmount == 0) {
                sharpieSet.remove(i);
                i--;
            }
        }
    }
}

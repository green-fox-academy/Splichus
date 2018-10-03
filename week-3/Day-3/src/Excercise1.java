class PostIt {
    String backgroundColor;
    String text;
    String textColor;
    public PostIt() {

    }

    public PostIt(String backgroundColor, String text, String textColor) {
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.text = text;
    }
}

public class Excercise1 {


    public static void main(String[] args) {

        PostIt first = new PostIt();
        first.backgroundColor = "orange";
        first.text = "Idea 1";
        first.textColor = "blue";

        PostIt second = new PostIt();
        second.backgroundColor = "pink";
        second.text = "Awesome!";
        second.textColor = "black";

        PostIt third = new PostIt();
        third.backgroundColor = "yellow";
        third.text = "Suberb!";
        third.textColor = "Green";

        PostIt fourth = new PostIt("blue", "Poklop", "Yellow");


//        Create a PostIt class that has
//                a backgroundColor
//                a text on it
//                a textColor
//                Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"

    }
}

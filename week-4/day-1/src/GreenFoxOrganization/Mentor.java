package GreenFoxOrganization;

public class Mentor extends Person {
    String level;

    public Mentor() {
        super();
        this.level = "intermeddiate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    @Override
    void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    String introduce() {
        String toReturn = super.introduce()+" "+level+ " mentor.";
        return toReturn;
    }
}

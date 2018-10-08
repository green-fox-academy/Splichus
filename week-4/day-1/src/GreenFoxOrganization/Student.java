package GreenFoxOrganization;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    public Student() {
        super();
        this.previousOrganization = "The school of life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    String introduce() {
        String toReturn = super.introduce()+" from " +previousOrganization+ " who skipped " +skippedDays+ "days from the course already.";
        System.out.println(toReturn);
        return toReturn;
    }

    void skipDays(int numberOfDays) {
        skippedDays+=numberOfDays;
    }
}

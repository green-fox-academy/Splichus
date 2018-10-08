package GreenFoxOrganization;

public class Sponsor extends Person{
    String company;
    int hiredStudents;

     Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    @Override
    String introduce() {
        String toReturn = super.introduce()+" who represents " +company+ " and hired " +hiredStudents+ " students so far.";
        System.out.println(toReturn);
        return toReturn;
    }

    @Override
    void getGoal() {
        System.out.println("Hire brilliant junior software developers");
    }
    void hire() {
         hiredStudents++;
    }
}

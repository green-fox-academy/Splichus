class Student {
    public void learn() {

    }
    public void question (Teacher teacher) {
        teacher.answer();
    }
}

class Teacher {

    public void teach (Student student){
        student.learn();
    }

    public void answer() {

    }
}
public class StudentAndTeachers {

    public static void main(String[] args) {
        Teacher uca = new Teacher();
        uca.teach(new Student());
    }
}

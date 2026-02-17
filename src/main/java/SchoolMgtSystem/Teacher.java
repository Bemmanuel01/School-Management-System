package SchoolMgtSystem;

public class Teacher extends Staff implements Teachable{

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(Course course) {

    }
}

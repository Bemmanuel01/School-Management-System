package SchoolMgtSystem;

public class Student extends Person{

    private boolean expelled;

    public Student(String name, int age) {
        super(name, age);
        this.expelled = false;
    }

    public void takeCourse(Course course){
        System.out.println(getName() + "is taking " + course.getCourseName());
    }

    public void setExpelled(boolean expelled) {
        this.expelled = expelled;
    }

    public boolean isExpelled(){
        return expelled;
    }
}



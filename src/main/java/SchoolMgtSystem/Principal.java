package SchoolMgtSystem;

public class Principal extends Staff{

    public Principal(String name, int age) {
        super(name, age);
    }

    public Student admitApplicant(Applicant applicant){
        if (applicant.getAge() >= 16){
            System.out.println(applicant.getName() + " has been admitted.");
            return new Student(applicant.getName(), applicant.getAge());
        } else{
            System.out.println("Applicant too young!");
            return  null;
        }
    }

    public void expelStudent(Student student){
        student.setExpelled(true);
        System.out.println(student.getName() + " has been expelled.");
    }
}

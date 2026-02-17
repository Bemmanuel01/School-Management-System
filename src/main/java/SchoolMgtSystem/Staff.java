package SchoolMgtSystem;

public abstract class Staff extends Person {
    private String staffId;

    public Staff(String name, int age) {
        super(name, age);
    }

    public String getStaffId() {
        return staffId;
    }
}

package entity;

<<<<<<< HEAD
import service.EmployeeManager;

public abstract class Employee { // Lớp trừu tượng Employee
=======
public abstract class Employee { // Lớp trừu tượng Employee
    public static long count = 0;
>>>>>>> e24dc39 (version 1.0)
    public String id;
    protected String fullName;
    protected String birthday;
    protected String phone;
    protected String email;
    protected double workingHours;
<<<<<<< HEAD
    protected EmployeeManager employeeManager = new EmployeeManager();
=======
>>>>>>> e24dc39 (version 1.0)

    public Employee() {
    }

    public Employee(String id, String fullName, String birthday, String phone, String email,
            double workingHours) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.workingHours = workingHours;
    }

    public abstract void showInfo();

    public abstract void updateInfoOfStaff();

    public abstract double totalSalary();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }
}

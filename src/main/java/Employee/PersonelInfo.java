package Employee;

public class PersonelInfo {
    String name;
    String department;
    int salary;

    void show() {
        System.out.println("Name: " + name);
    }

    void display() {
        System.out.println("Department: " + department);
    }

   public void setSalary() {
        System.out.println("Salary: " + salary);
    }
}

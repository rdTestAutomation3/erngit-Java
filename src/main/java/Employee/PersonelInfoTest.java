package Employee;

public class PersonelInfoTest {
    public static void main(String[] args) {
        PersonelInfo personalInfo1 = new PersonelInfo();
        PersonelInfo personalInfo2 = new PersonelInfo();

        personalInfo1.name = "Eren";
        personalInfo1.department = "Software Engineering";
        personalInfo1.salary = 10000;

        personalInfo2.name = "Eda";
        personalInfo2.department = "Finance";
        personalInfo2.salary = 12000;

        personalInfo1.show();
        personalInfo1.display();
        personalInfo1.setSalary();

        personalInfo2.show();
        personalInfo2.display();
        personalInfo2.setSalary();






    }
}

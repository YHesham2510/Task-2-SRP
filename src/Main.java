import java.text.DecimalFormat;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static class Employee{
        private UUID id;
        private String First_name;
        private String Last_name;
        private double salary;

        public Employee(UUID id, String firstName, String lastName, double salary) {
            this.id = id;
            this.First_name = firstName;
            this.Last_name = lastName;
            this.salary = salary;
        }
        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }
        public String getName(){
            return First_name;
        }
        public void setName(String name) {
            this.First_name = name;
        }
        public String getLast_name(){
            return Last_name;
        }
        public void setLast_Name(String Lastname) {
            this.Last_name = Lastname;
        }

        public double getSalary(){
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
    public static class calculate_salary{
        public double calculate(Employee employee){
            System.out.println("Salary calulated");
            return employee.getSalary();
        }
    }
    public static class SaveEmployee{
        public void save(Employee employee){
            System.out.println("Salary is saved successfully");
        }
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        UUID eId = UUID.randomUUID();
        Employee employee = new Employee(eId, "Youssef", "Hesham", 50000.0);

        calculate_salary sa = new calculate_salary();
        double salary_calculated = sa.calculate(employee);
        System.out.println("Calculated");

        SaveEmployee SE = new SaveEmployee();
        SE.save(employee);
        System.out.println("Employee data has been save to database");



    }
}
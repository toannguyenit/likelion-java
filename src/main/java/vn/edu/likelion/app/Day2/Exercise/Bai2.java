package vn.edu.likelion.app.Day2.Exercise;

public class Bai2 {
    static class Employee{
        String name;
        int age;
        int salary;

        public Employee(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public void work(){
            System.out.println("Working as Employee!");
        }

        public void getSalary(){
            System.out.println("Employee Salary: " + salary);
        }
    }

    static class HRManager extends Employee{
        public HRManager(String name, int age, int salary) {
            super(name, age, salary);
        }

        @Override
        public void work(){
            System.out.println("Managing Employees By HR");
        }

        @Override
        public void getSalary(){
            System.out.println("Manager Salary: " + salary);
        }

        public void addEmployee(Employee employee){
            System.out.println("Adding new employee: " + employee.name);
        }
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Duc Tan", 26, 4000);
        employee.work();
        employee.getSalary();

        HRManager hrManager = new HRManager("Song Toan", 28, 7000);
        hrManager.work();
        hrManager.getSalary();

        hrManager.addEmployee(employee);
    }
}

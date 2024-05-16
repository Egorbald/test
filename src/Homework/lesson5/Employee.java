package Homework.lesson5;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String departament;

    public Employee(int id2, String surname2, int age2, double salary2, String departament2){
        id=id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        departament = departament2;
    }

    double uvelichenieZarplat() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25, 555.55,  "IT");
        Employee emp2 = new Employee(2, "Petrov", 30, 888.88, "Sales");

        emp1.uvelichenieZarplat();
        System.out.println("Novaya zarplata rabotnika " + emp1.surname + ": " + emp1.salary);

        double newSalary = emp2.uvelichenieZarplat();
        System.out.println("Novaya zarplata rabotnika " + emp2.surname + ": " + emp2.salary);


    }
}

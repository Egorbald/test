package Lesson6;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department; // Исправление: Изменена опечатка в названии переменной

    // Конструктор с параметрами: id, surname и age
     Employee(int id2, String surname2, int age2) {
        this(surname2, age2);
        id=id2;

    }

    // Конструктор с параметрами: surname и age
    Employee(String surname3, int age3) {
        surname = surname3;
        age = age3;
    }

    // Конструктор с параметрами: id, surname, age, salary и department
    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        this(id4,surname4, age4);
        salary=salary4;
        department=department4;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.id);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.id);
        Employee emp3 = new Employee(2, "Sidiriv", 40, 100.35, "IT");
        System.out.println(emp3.department);


    }
}

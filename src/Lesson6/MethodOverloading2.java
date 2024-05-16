package Lesson6;

public class MethodOverloading2 {

    // Исправление: Добавлен тип возвращаемого значения "int".
    public int sum(int i1, int i2){
        // Исправление: Убран лишний "return".
        return i1 + i2;
    }

    // Исправление: Добавлен тип возвращаемого значения "String".
    public String sum(String s1, String s2){
        // Исправление: Убран лишний "return".
        return s1 + s2;
    }
}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();

        int a = mO2.sum(5, 7); // Вызов метода sum с двумя целыми числами.
        System.out.println(a);

        String s = mO2.sum("privet, ", "moy drug"); // Вызов метода sum с двумя строками.
        System.out.println(s);
    }
}

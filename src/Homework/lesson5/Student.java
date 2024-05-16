package Homework.lesson5;

public class Student {
    int studentid;
    String name;
    String surname;
    int course;
    // оценки по 10-ти балльной шкале
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;

}

class StudentTest{

    double sreadArifmOcenka(Student st) {
        double sredOcenka = (st.mathAverageGrade + st.economicsAverageGrade
                + st.foreignLanguageAverageGrade) / 3;
        System.out.println("Srednyaya Arifmeticheskaya Ocenka Studenta "
                + st.name + " " + st.surname + ": " + sredOcenka);
        return  sredOcenka;
    }



    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentid=1;
        st1.name="Nikolay";
        st1.surname="Ivanov";
        st1.course=3;
        st1.mathAverageGrade=7.8;
        st1.economicsAverageGrade=9.2;
        st1.foreignLanguageAverageGrade=8.8;


        Student st2 = new Student();
        st2.studentid=2;
        st2.name="Alelsey";
        st2.surname="Petrov";
        st2.course=1;
        st2.mathAverageGrade=6.3;
        st2.economicsAverageGrade=7;
        st2.foreignLanguageAverageGrade=8.5;


        Student st3 = new Student();
        st3.studentid=3;
        st3.name="Anton";
        st3.surname="Sidorov";
        st3.course=4;
        st3.mathAverageGrade=9.1;
        st3.economicsAverageGrade=9;
        st3.foreignLanguageAverageGrade=10;

        StudentTest sTest = new StudentTest();
        sTest.sreadArifmOcenka(st1);
        sTest.sreadArifmOcenka(st2);
        sTest.sreadArifmOcenka(st3);






    }
}

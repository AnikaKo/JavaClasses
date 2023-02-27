package class23Polymorphism;

public class StudentTester {

    public static void main(String[] args) {

//polymorphism
        /*CollegeStudent cs=new CollegeStudent();
        SchoolStudent ss=new SchoolStudent();
        SyntaxStudent syn=new SyntaxStudent();
         */

        Student [] students={new CollegeStudent(), new SyntaxStudent(),new SchoolStudent()};

        for (Student student:students){
            student.doHomeWork();
            student.practice();
            student.study();
        }
    }
}

package class17;

public class StudentTester {
    public static void main(String[] args) {
        Student student1=new Student("Anika", 12, 33,53);
        student1.weight =53;
        student1.age =33;
        student1.id=12;
        student1.name="Anika";

        Student student2=new Student("Milica",17, 30,67);
        student2.weight =67;
        student2.age =30;
        student2.id=17;
        student2.name="Milica";

        Student student3=new Student("Milos", 18, 37,70);
        student3.age =37;
        student3.id=18;
        student3.name="Milos";

        Student student4=new Student("Mili", 12,23,45);
        student4.weight =45;
        student4.age =23;
        student4.id=12;
        student4.name="Mili";

        Student student5=new Student("Milo", 11, 39,67);
        student5.weight =67;
        student5.age =39;
        student5.id=11;
        student5.name="Milo";
        System.out.println(student1);
student1.printInfo();
student2.printInfo();


    }
}

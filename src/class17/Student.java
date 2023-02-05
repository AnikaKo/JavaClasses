package class17;

public class Student {
    String name;
    int id;
    int age;
    int weight;


    Student(String sName, int sId, int sAge, int sWeight ){
        id=sId;
        name=sName;
        age=sAge;
        weight=sWeight;


    }

    void printInfo(){
        System.out.println(name+" "+id+" "+age+" "+weight);
    }
}

package class12;

public class StringDemo10 {
    public static void main(String[] args) {
        String str="java is not pain";
        System.out.println(str.indexOf("j")); // koristi se " i moze da se stavi i cela rec
        System.out.println(str.indexOf("a"));

        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i)+" has the index "+i);
        }
    }
}

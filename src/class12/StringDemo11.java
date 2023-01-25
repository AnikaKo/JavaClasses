package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        String str="Send it to support channel. More Java";
        String newStr=str.substring(28);// intelij broji slova kada se obeleze misem , donji desni ugao
        System.out.println(newStr);
        System.out.println(str.substring(0,27));// we can also cpecify the starting and the ending point


    }
}

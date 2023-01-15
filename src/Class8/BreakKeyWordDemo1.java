package Class8;

public class BreakKeyWordDemo1 {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=75;
       while(summer){
            if(temp<=100){
                System.out.println("I love summer because Temperature is "+temp);
            }else{
                System.out.println("Its very hot");
                break;} temp+=5;}


        /* jos jedan nacin
        while(temp<=105){
            if(temp<=100){
                System.out.println("I love summer because Temperature is "+temp);
            }else{
                System.out.println("Its very hot" +temp);
        } temp+=5} */

    }
}

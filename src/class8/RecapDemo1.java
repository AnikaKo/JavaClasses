package class8;

public class RecapDemo1 {
    public static void main(String[] args) {
        //10 8 6 4 2
        for(int a =10; a >=2; a--)
        {if(a%2==0){
            System.out.println(a);}}
        System.out.println("***********");
        //drugi nacin

       /* int b=10;
        while(b>=2){
            System.out.println(b);
            b-=2;}
        //treci nacin
        System.out.println("*****************");*/
        int c=10;

        do{System.out.println(c);
            c-=2;}
        while(c>=2);
    }
}

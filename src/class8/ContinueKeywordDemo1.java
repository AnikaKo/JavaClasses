package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {
 for(int i=0; i<10; i++){
     if(i==3||i==6||i==9){ //isto sto i (i%3==0)
         continue;}
     System.out.println(i);
     System.out.println("Hello world");// this line is skipped when i=3,6,9
     }
/*  if(i%3==0){continue;
else{System.out.println(i);}}
 */
    }
}

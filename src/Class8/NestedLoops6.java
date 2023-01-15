package Class8;

public class NestedLoops6 {
    public static void main(String[] args) {
        /*print  1 2 3 4 5
                 1 2 3 4 5
                 1 2 3 4 5 */

        for(int a=1; a<=3; a++){
            for(int b=1; b<=5; b++){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}

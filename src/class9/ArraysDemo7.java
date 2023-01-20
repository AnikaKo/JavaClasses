package class9;

public class ArraysDemo7 {
    public static void main(String[] args) {
        //Task2 create an array and store 10 20 30 4 5 6 7 80 add all the elements which are multiple of 2
        int [] numbers2 = {10, 20, 30, 4, 5, 6, 7, 80};
        int total=0;
        for(int i=0; i<numbers2.length; i++) {
            if (numbers2[i] % 2 == 0) {
                total = total + numbers2[i];
            }
        }
        System.out.println(total);
    }
}

package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {
      //create en empty array and store 45 44 33 20 10
      //and use the loope to add all the elements which are present in even index and print it after adding

      // 2task create an array and store 10 20 30 4 5 6 7 80 add all the elements which are multiple of 2
int sum=0;
        int [] numbers=new int[5];
        numbers [0]=45;
        numbers [1]=44;
        numbers [2]=33;
        numbers [3]=20;
        numbers [4]=10;


        for (int i = 0; i < numbers.length; i++) {
            if(i%2==0) {
                sum= sum+ numbers[i];// =sum+numbers[i]
            }}

        System.out.println(sum);
        System.out.println("************************");

        int [] numbers1= new int[5];
        numbers1[0]=45; //45+0
        numbers1[1]=44;
        numbers1[2]=33; // 45+33=>78
        numbers1[3]=20;
        numbers1[4]=10; // 78+10=> 88
        // numbers[5]=50; error out of bounds
        int tot=0;
        for (int i = 0; i < numbers1.length; i++) {
            if(i%2==0){
                tot=tot+numbers1[i];
            }
        }
        System.out.println(tot);




    }
}

package class9;

public class ArraysDemo3 {
    public static void main(String[] args) {
        //sreate an array to store the letters ABcdeF
        char  [] letters={'A', 'B', 'c', 'd', 'f', 'E'};
        letters[0]='z'; //updating the element at index 0
        for(int i=0; i< letters.length; i++){
            System.out.println(letters[i]);}

    }
}

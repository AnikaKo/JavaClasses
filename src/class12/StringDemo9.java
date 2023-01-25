package class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="djksdksdhf 7676 *&^%";
       int counter=0;

        for(int i =0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total asAlphabetic in Str "+counter);

int counter1=0;
        for(int i =0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                counter1++;
            }
        }
        System.out.println("Total asDigit Str "+counter1);
    }
}

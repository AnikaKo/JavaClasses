package class12;

public class StringDemo8 {
    public static void main(String[] args) {
        //very important for the interview
        String str = "Java is Love";
        char character = str.charAt(0);//0 1 2 3 4
        System.out.println(character);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));}

            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    counter++;
                }
            }
            System.out.println(counter);
        }

    }
package class28LinkedList;


    import java.util.ArrayList;

public class RemoveDemo {
        public static void main(String[] args) {
            ArrayList<String> words=new ArrayList<>();
            words.add("sdlc");
            words.add("Jira");
            words.add("Cgit");
            words.add("java");
            // it does not work in java 9 and below
            var name="kdbsfnjksdf";
            var c='s';
            var f=12.5;

            // it works from java 6 to java 19
        /*
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }
         */
            // does not work in java 7
            words.removeIf(x -> x.endsWith("a"));

            System.out.println(words);

        }
}

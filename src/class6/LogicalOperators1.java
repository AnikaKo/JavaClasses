package class6;

public class LogicalOperators1 {
    public static void main(String[] args) {

        boolean boughtCho=true;
        boolean boughtFl=true;
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);

        if(boughtCho||boughtFl){
            System.out.println("I m happy");}
        else{
            System.out.println("i am sad");}

        boolean wifi=true;
        boolean fiveG=true;
        if(wifi||fiveG){
            System.out.println("you r good for browsing the internet");}
        else{
            System.out.println("either connect to the wifi or to 5g");}
    }
}

package class12;

public class ParfumeTester {
    public static void main(String[] args) {
        Parfume mugler=new Parfume();
        mugler.make="mugler";
        mugler.model="womanity";
        mugler.color="pink";
        mugler.year="2018";
        mugler.smell();

        Parfume shisheido=new Parfume();
        shisheido.color="gold";
        shisheido.make="shisheido";
        shisheido.model="zen";
        shisheido.year="2017";
        shisheido.feelLike();

    }
}

package lesson5;

public class lesson5 {
    public static void main(String[] args) {
        Passport passport=new Passport("Igor", "Shevchenko",33,true);


        System.out.println(passport.getName());
        passport.print();


    }
}

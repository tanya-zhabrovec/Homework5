import java.util.Locale;

public class Lesson2 {
    public static void main(String[] args) {
        String b1="bunny";
        String b2="bunny";
        String s3=new String("bunny");
        String s4="bun"+"ny";
        System.out.println(s3==s4);
    //    int t=12;
    //    int r=1;
    //    System.out.println(t == r);
        System.out.println(s4.equals(s3));


        String string="abcde";
        String result = null;
        System.out.println("Length =" + string.length());
        int r = 1;
        System.out.println("Char #" + r + " = " + string.charAt(r));
        System.out.println(string.indexOf('c'));
        System.out.println(string.indexOf("bc"));
        r=string.indexOf("bc");
        System.out.println(r);
        System.out.println(string.toUpperCase());
        System.out.println(string.substring(1, 4).toUpperCase().replace("C", "and"));
        string = string.substring(1, 4);
        System.out.println(result);
        result = string.substring(0, 2)+String.valueOf(string.charAt(2)).toUpperCase()+string.substring(3, string.length());
        System.out.println(result);




    }
}

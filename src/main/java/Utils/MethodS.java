package Utils;

public class MethodS {
    public static void publicMethod(){
        System.out.println("PUBLIC METHOD");
    }
    public static void printD (int num1, int num2) {

        int result = num1/num2;
        System.out.println(result);
        publicMethod();
    }
    protected static void printProtectedMethod(String str){
        System.out.println(str);
    }
    public static String getTeacherName(){
        return "Vasiliy";
    }
}

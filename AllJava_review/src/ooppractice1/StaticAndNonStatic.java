package ooppractice1;

public class StaticAndNonStatic {

    String name = "tom";//non static globale var
    static int age = 29;//static globale var

    public static void main(String[] args) {
        //how to call static methods and vars
        //1. direct calling:
        sum();
        System.out.println(age);
        //2.calling by classname
        StaticAndNonStatic.sum();
        System.out.println(StaticAndNonStatic.age);
        //how to call non static methods and vars
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.SendMa();
        System.out.println(obj.name);

        // you can also call static vars and static methods with object but its not good practice

    }

    public void SendMa() {
        System.out.println("sendme =====mailmethod");
    }

    public static void sum() {
        System.out.println("sum static method");

    }

}

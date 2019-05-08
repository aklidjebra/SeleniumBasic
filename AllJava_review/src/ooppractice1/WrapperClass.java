package ooppractice1;

public class WrapperClass {
    public static void main(String[] args) {
        String X="100";
        System.out.println(X+20);

        // we can converte String to Int, Double; boolean
        // this is how to convert String to int(data conversion)
        int A= Integer.parseInt(X);
        System.out.println(A+20);
        String  Z="15.43";
        double B= Double.parseDouble(Z);
        System.out.println(B+2);
        String V="true";
        boolean C= Boolean.parseBoolean(V);
        System.out.println(C);


        // int to String
        int j=90;
        String H=String.valueOf(j);
        System.out.println(H+20);


    }
}

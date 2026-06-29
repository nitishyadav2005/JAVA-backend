package Exceptions;

public class ExceptionDemo {
    static void main(String[] args) {
//        int a = 10;
//        int result = a/0;
//        System.out.println("Done");
//        try{
//            //Exception generating statements
//            int result = 10/0;
//            System.out.println("Done");
//        } catch (Exception e) {
//            // exception handling statements
//            System.out.println("IN catch block");
//        }
        int []a = {1, 2, 3};
        try {
            System.out.println(a[6]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        } catch (java.lang.ArithmeticException e){
            System.out.println("Arithmetic exception");
        } finally {
            // always executes
            System.out.println("FINALLY");
        }
        System.out.println("Outside by catch") ;
    }
}

import java.io.*;
import java.util.Scanner;
class ExceptionHandle  {
    int a, b, div ;
    public void run()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the Value of b");
        b=sc.nextInt();
        try{
            div=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Handled");
        }
    System.out.println("Quotient ="+div);
    }
    
}
class Main{
    public static void main(String[]args)
    {
        ExceptionHandle ex = new ExceptionHandle();
        ex.run();
    }
   
}

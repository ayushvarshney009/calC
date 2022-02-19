import java.util.InputMismatchException;
import java.util.Scanner;

public class calC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {


        float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();

         float sum = num1 + num2;
         float mul =num1 * num2;
            float sub =num1 - num2;
            float div =num1 /num2;
            float rem =num1 % num2;

            System.out.println(sum);
            System.out.println(mul);
            System.out.println(sub);
            System.out.println(div);
            System.out.println(rem);
        }catch(InputMismatchException e ){

            System.out.println("Enter DIGITS only");

        }

        catch(ArithmeticException e){

            System.out.println(e);


        }

    }
}

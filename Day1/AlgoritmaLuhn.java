import java.util.Scanner;
public class AlgoritmaLuhn {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        long num;
        int digit;
        int sum = 0;
        System.out.println("Enter the digitsof credit card number: ");
        num = input.nextLong();

        while (num> 0){
            digit = (int) num % 10;

            if (num % 2 !=0){
                digit *=2;
            }
            if (digit >9){
                digit -=9;
            }
            sum += digit;
        }
        if(sum %10 ==0){
            System.out.println("Credit card number is valid.");
        }
        else {
            System.out.println("Credit card number is invalid. Please try again");
            System.out.println("main() : Exit point");
        }

    }
}

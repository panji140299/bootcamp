import java.util.Scanner;
public class PalindromCheck {
    public static void main(String[] args) {
        int r,sum=0, temp;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number : ");
        n = input.nextInt();
        temp = n;

        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

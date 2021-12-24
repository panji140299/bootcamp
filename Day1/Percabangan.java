import java.util.Scanner;
public class Percabangan {
    public static void main(String [] args){
    
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Total Belanjaan : Rp. ");
        belanja = scan.nextInt();

        //percabangan
        if (belanja > 150000){
            System.out.println("Selamat anda mendapatkan voucher");
        }
        else {
            System.out.println("Maaf anda tidak mendapatkan voucher");
        }
    }
}

import java.util.Scanner;
public class OperatorAritmatika {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int angka1,angka2;
        int hasil;
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        //penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil = "+hasil);

       
       System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        //pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil = "+hasil);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        //Perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil = "+hasil);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        //pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil = "+hasil);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        //sisa bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil = "+hasil);
    }
}

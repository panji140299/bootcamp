import java.util.Scanner;
public class LampuLaluLintas {
    public static void main(String [] args){
    String lampu;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Inputkan Warna Lampu: ");
    lampu = scan.nextLine();
    
    switch(lampu){
        case "merah":
        System.out.println("Lampu Merah, berhenti!");

        case "kuning":
        System.out.println("Lampu Kuning, Harap berhati-hati!");

        case "Hijau":
        System.out.println("Lampu Hijau, Silahkan Jalan!");

        default:
        System.out.println("Warna lampu salah!");
    }

    }
    
}

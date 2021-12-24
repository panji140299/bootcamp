import java.util.Scanner;

public class Latihan_4 {
    public static void main(String[] args) {
        int tahun;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Tahun : ");
        tahun = input.nextInt();

        if (tahun % 400 == 0){
            System.out.println(tahun+" Merupakan tahun kabisat");
        }
        else if (tahun % 100 == 0){
            System.out.println(tahun+" Bukan tahun kabisat");
        }
        else if (tahun % 4 == 0){
            System.out.println(tahun+" Merupakan tahun kabisat");
        }
        else {
            System.out.println(tahun+" Bukan tahun kabisat");
        }
    }
}

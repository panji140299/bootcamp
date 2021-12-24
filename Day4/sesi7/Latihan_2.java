import java.util.ArrayList;
import java.util.Scanner;
public class Latihan_2 {
    public static void main(String[] args) {
        String[][] bahasa = {{"PHP", "Ruby","Java"},{"Golang", "Javascript", "Swift"}};

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < bahasa.length; i++) {
            for (int j = 0; j < bahasa[i].length; j++) {
                System.out.format("siapa yang akan duduk di kelas (%d, %d) : ", i, j);
                bahasa[i][j] = scan.nextLine();
            }
        }
        System.out.println("================================");
            for (int i = 0; i < bahasa.length; i++) {
                for (int j = 0; j < bahasa[i].length; j++) {
            System.out.print("| "+bahasa[i][j]+" | \t");
            
        }
        System.out.println();
    }
    System.out.println("================================");

    }


}

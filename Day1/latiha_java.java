import java.util.LinkedList;
public class latiha_java {
    public static void main(String [] args){
        //Membuat instance/Objek dari LinkedList
        LinkedList<String> buah = new LinkedList<>();

        //Menambahkan Data pada objek buah
        buah.add("Jeruk");
        buah.add("Apel");
        buah.add("Jambu");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sisrsak");

        //Mencetak/Menampilkan Data
        System.out.println("Nama Buah : "+buah);

        //Menghitung Jumlah/Ukuran pada objek LinkedList
        System.out.println("Jumlah buah : "+buah.size());
        
        
        buah.addFirst("Paling atas"); //Menambahkan data pada index teratas
        buah.addLast("Paling bawah"); //Menambahkan data pada index terbawah
        
        buah.set(2, "Diubah"); // Mengubah data pada No Index 2
        buah.set(5, "Diubah"); // Mengubah data pada No Index 5

        //Menampilkan Data
        System.out.println("Nama Buah : "+buah);

        //Mengambil Data pada Urutan teratas
        System.out.println("Data Terata : "+buah.getFirst());
        //Mengambil Data pada Urutan terbawah
        System.out.println("Data Terata : "+buah.getLast());
        //Mengambil Data pada Nomor Index 1
        System.out.println("Data Terata : "+buah.get(1));
        //Mengambil Data pada Nomor Index 3
        System.out.println("Data Terata : "+buah.get(3));

        //Menghapus Element
        buah.removeFirst();
        buah.removeLast();
        buah.remove(1);

        //Cetak
        System.out.println(buah);
    }
    
}

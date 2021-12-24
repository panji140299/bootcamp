import java.util.LinkedList;
public class linkedlist {
    public static void main(String [] args){
        //Membuat instance/Objek dari LinkedList
        LinkedList<String> barang = new LinkedList<>();

        //Menambahkan data objek barang
        barang.add("Laptop");
        barang.add("Komputer");
        barang.add("Radio");

        //Mencetak Apakah ada data pada objek barang kosong
        if(barang.isEmpty()){
            System.out.println("Data Kosong");
        }
        else{
            System.out.println("Data Penuh");
        }

        //Mencetak Apakah Sebuah Element ada didalam linkedlist
        if(barang.contains("Komputer")){
            System.out.println("Barang ditemukan");
        }
        else{
            System.out.println("Barang Tidak ditemukan");
        }

    } 
}

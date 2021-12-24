public class Latihan_3 {
    public static void main(String[] args) {
       int pembelian = 1000000;
       double diskon; 
       double bayar;

       diskon = pembelian*0.1;
       bayar = pembelian - diskon;

       System.out.println("Pembelian = Rp."+pembelian);
       System.out.println("Diskon 10% = RP."+diskon);
       System.out.println("Harga Bayar = Rp."+bayar);
    }
}

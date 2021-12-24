package BangunDatar;

public class main {
    public static void main(String[] args) {
        
    BangunDatar bangunDatar = new BangunDatar();

    Persegi persegi = new Persegi();
    persegi.sisi = 2;

    Lingkaran lingkaran = new Lingkaran();
    lingkaran.r = 22;
    
    PersegiPanjang persegiPanjang = new PersegiPanjang();
    persegiPanjang.panjang = 8;
    persegiPanjang.lebar = 4;

    Segitiga segitiga = new Segitiga();
    segitiga.alas = 12;
    segitiga.tinggi = 8;

    System.out.println("Luas Bangun Datar : "+bangunDatar.luas());
    System.out.println("Keliling Bangun Datar : "+bangunDatar.keliling());
    
    System.out.println("Luas Persegi : "+persegi.luas()); 
    System.out.println("Keliling Peregi : "+persegi.keliling());

    System.out.println("Luas Lingkaran : "+lingkaran.luas());
    System.out.println("Keliling Lingkaran : "+lingkaran.keliling());

    System.out.println("Luas Persegi Panjang : "+persegiPanjang.luas());
    System.out.println("Keliling Persegi panjang : "+persegiPanjang.keliling());

    System.out.println("Luas Segitiga : "+segitiga.luas());
    System.out.println("Le;iling Segitiga : "+segitiga.keliling());
}
}

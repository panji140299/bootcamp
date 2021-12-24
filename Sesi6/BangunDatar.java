// package inheritance;

public class BangunDatar {
    
    float luas(){
        System.out.println("Menghitung laus bangun datar");
        return 0;
    }
    
    float keliling(){
        System.out.println("Menghitung keliling bangun datar");
        return 0;
    }
}

public class Persegi extends BangunDatar {
    float sisi;   
}



public class Lingkaran extends BangunDatar{
    
    // jari-jari lingkaran
    float r;
    
}

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;
}

public class Segitiga extends BangunDatar {
    
    float alas;
    float tinggi;
    
}


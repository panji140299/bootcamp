package BangunDatar;

public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;

    @Override
    float luas(){
        return (alas * tinggi)/2;
    }
    @Override
    float keliling() {
        return 0;
    }
}

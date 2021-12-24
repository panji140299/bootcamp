package BangunDatar;

public class Persegi  extends BangunDatar{
    float sisi;

    @Override
    float luas(){
       return sisi*sisi;
    }  
    @Override
    float keliling(){
        return sisi*4;
    }
}

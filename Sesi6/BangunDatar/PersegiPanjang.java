package BangunDatar;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    @Override
    float luas(){
        return panjang * lebar;
    }  
    @Override
    float keliling(){
        return (panjang*2)+(lebar*2);
    }
}

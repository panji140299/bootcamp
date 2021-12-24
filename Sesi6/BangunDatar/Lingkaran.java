package BangunDatar;

public class Lingkaran extends BangunDatar {
    float r;

    @Override
    float luas(){
        return 3.14f*3.14f*r;
    }

    @Override
    float keliling(){
        return 2*3.14f*r;
    }
}

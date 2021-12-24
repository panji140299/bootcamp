public class Latihan_1 {
    public static void main(String[] args) {
        int max,min,avg,i;
        int[] nilai = {4,8,30};

        min = nilai[0];
        max = nilai[0];

        for (i=0; i<3; i++){
            if(nilai[i]>max){
                max = nilai[i];
            }
            else if(nilai[i]<min){
                min = nilai[i];
            }
        }
        avg = (nilai[0]+nilai[1]+nilai[2])/3;
        System.out.println("Rata-ratanya adalah "+avg);
        System.out.println(max+" adalah bilangan terbesar");
        System.out.println(min+" adalah bilangan terkecil");


    }    
}

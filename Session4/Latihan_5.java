public class Latihan_5 {
    public static void main(String[] args) {
        int x1,x2;
        int y1,y2;
        y1 = 4;
        y2= 3;
        x1 = (y1+y2) * (y1+y2);
        x2 = (y1%4) * y2;

        boolean hasil1 = x1 >= x2;
        boolean hasil2 = x2 >= x1;
        boolean hasil3 = x1%4 == ++x2%5;  
        
        System.out.println("X1 lebih besar sama dengan X2 = "+hasil1);
        System.out.println("X2 lebih besar sama dengan X1 = "+hasil2);
        System.out.println("X1 mod 4 == ++X2 mod 5 = "+hasil3);
    }
}

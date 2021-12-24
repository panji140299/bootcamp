public class nilaiDesimal {
    public static void main(String[] args) {
        double a = 0.6+0.6+0.6+0.6+0.6+0.6;
        double b = 0.6*6;
        System.out.println("A is "+a);
        System.out.println("B is "+b);
        if (a != b){
            System.out.println("A is not equal to B");
        }
        if (Math.abs(a-b) < .001){
            System.out.println("A is close enough to B");
        }
    }   
}

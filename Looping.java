public class Looping {
    public static void main(String[] args) {
        String a = "*****";
        int b = 0;
        int c = 1;
        int i;
        
        for (i = 1; i <6; i++){
            System.out.println(a);
        }

        // for (i=1;i<9;i++){
        //     System.out.println(i+b);
        // }

        for (i=1;i<10;i++){
            System.out.println((c*(i+1)));
        }
    }
}

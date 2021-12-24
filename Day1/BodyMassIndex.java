import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String [] args){
    
        /*Aturan BMI
            BMI <18.5 = Underweight
            18.5<= BMI < 25.0 = Normal
            25.0<= BMI 30.0 = Overweight
            30<= BMI = Obese

            BMI = Berat Badan / Tinggi Badan^2
            1 pound = kg
            1 inch = m
        */
        double tinggi;
        double berat;
        double bmi;
        String hasil;
        Scanner input = new Scanner(System.in);

        System.out.print("Tinggi Badan (inch): ");
        tinggi = input.nextDouble();
        System.out.print("Berat Badan (Pound): ");
        berat = input.nextDouble();

        double m = tinggi * 0.0254;
        double kg = berat * 0.454;
        bmi = kg / (m*m);

        if (bmi < 18.5){
            hasil = "Underweight";
        }
        else if (bmi < 25.0){
            hasil = "Normal";
        }
        else if (bmi < 30.0){
            hasil = "Overweight";
        }
        else {
            hasil = "Obese";
        }

        // System.out.println("Tinggi (m): "+m);
        // System.out.println("Berat (kg): "+kg);
        System.out.println("BMI : "+bmi);
        System.out.println("Interpretation = "+hasil);

    }
}

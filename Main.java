import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Random gen = new Random();
        int suma = 0;
        int iloczyn = 1;
        double potega = 0;
        
        System.out.print("Losowe liczby: ");
        for (int i = 0; i < 5; i++) {
            int liczby = gen.nextInt(10);
            System.out.print(liczby + " ");
            suma = suma + liczby;
            iloczyn = iloczyn * liczby;
            potega = potega + Math.pow(liczby,2);
        }
        
        System.out.println("\nSuma: " + suma);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Potęga: " + potega);
    }
}

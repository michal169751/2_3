import java.util.Random;
import java.lang.Math;
class Main {
  public static void main(String[] args)
  {
    Random generator = new Random();
    for (int i=0; i<5; i++)
      {
        double a = generator.nextInt(9);
        double b = generator.nextInt(9);
        double c = generator.nextInt(9);
        double d = generator.nextInt(9);
        double e = generator.nextInt(9);
      }
  }
}
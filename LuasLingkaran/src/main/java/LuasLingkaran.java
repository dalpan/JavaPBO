
import java.util.Scanner;
/**
 * @author Danang Avan Maulana
 */
public class LuasLingkaran {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    double phi=3.14;
    double jari,luas;
    System.out.print("Jari-jari lingkaran:");
    jari=input.nextDouble();
   
    luas = phi*jari*jari;
   
    System.out.println("Luas Lingkaran = " + (double)luas);
   
    }
}

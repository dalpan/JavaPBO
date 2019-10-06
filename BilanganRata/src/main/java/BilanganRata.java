/**
 *
 * @author Danang Avan Maulana*/
import java.util.Scanner;
public class BilanganRata {
    public static void main(String[] args) {
        System.out.println("Menetukan Bilangan Terbesar, Terkecil, dan Rata-rata\n");
        Scanner input = new Scanner(System.in);
        double x; double y; double z; double avg;
        System.out.print("Masukkan Bilangan Pertama (X): ");
        x = input.nextDouble();
        System.out.print("Masukkan Bilangan Kedua (Y) : ");
        y = input.nextDouble();
        System.out.print("Masukkan Bilangan Ketiga (Z) : ");
        z = input.nextDouble();
        avg = (x + y + z) / 3;
        System.out.println("\nHasil:");
        System.out.println("Rata-ratanya adalah : " + avg);
        if (x == y && y == z) {System.out.println("Ketiga Bilangan Sama Besar");
        } else if (x > y && x > z) {System.out.println(x + " adalah bilangan terbesar");
        } else if (y > z && y > x) {System.out.println(y + " adalah bilangan terbesar");
        } else if (z > x && z > y) {System.out.println(z + " adalah bilangan terbesar");
        } else if (x == y && x > z) {System.out.println(x + " adalah bilangan terbesar");
        } else if (x == z && x > y) {System.out.println(x + " adalah bilangan terbesar");
        } else {System.out.println(y + " adalah bilangan terbesar");}        
        if (x == y && y == z) {System.out.println("Ketiga Bilangan Sama Kecil");
        } else if (x < y && x < z) {System.out.println(x + " adalah bilangan terkecil");
        } else if (y < z && y < x) {System.out.println(y + " adalah bilangan terkecil");
        } else if (z < x && z < y) {System.out.println(z + " adalah bilangan terkecil");
        } else if (x == y && x < z) {System.out.println(x + " adalah bilangan terkecil");
        } else if (x == z && x < y) {System.out.println(x + " adalah bilangan terkecil");
        } else {System.out.println(y + " adalah bilangan terkecil");
        }}}


import java.util.Scanner;
/*** @author Danang Avan Maulana */
public class GanjilGenap {
    public static void main(String[] args) {
        System.out.println("Program Menghitung Ganjil/Genap");
        Scanner input = new Scanner(System.in);
        int bil; int i; int a;
        System.out.print("Masukan Banyak Bilangan  : ");
        bil = input.nextInt();
        for (i = 1; i <= bil; i++) {
            System.out.println("Masukan Bil : ");
            a = input.nextInt();

            if (a % 2 == 0) {
                System.out.println("Genap");
            } else if (a % 2 == 1) {
                System.out.println("Ganjil");
            }
        }
    }
}

import java.util.Scanner;

public class CekPrimaRekursif08 {
    public static void main(String[] args) {
        Scanner scanner08 = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = scanner08.nextInt();
        if (cekPrimaRekursif(n, 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
    public static boolean cekPrimaRekursif(int n, int pembagi) {
        if (n <= 1) {
            return false;
        }
        if (pembagi == n) {
            return true;
        }
        if (n % pembagi == 0) {
            return false;
        } else {
            return cekPrimaRekursif(n, pembagi + 1);
        }
    }
}

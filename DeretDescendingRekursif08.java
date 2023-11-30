import java.util.Scanner;

public class DeretDescendingRekursif08 {

    static void deretRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
    }
    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc08.nextInt();

        System.out.print("Deret Rekursif: ");
        deretRekursif(n);
        System.out.println();

        System.out.print("Deret Iteratif: ");
        deretIteratif(n);
        System.out.println();
    }
}

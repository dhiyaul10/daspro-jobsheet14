import java.util.Scanner;
public class Percobaan2Modif1 {

    static int hitungPangkat(int x, int y, StringBuilder deret) {
        if (y == 0) {
            deret.append("1");
            return 1;
        } else {
            int hasil = x * hitungPangkat(x, y - 1, deret);
            deret.append("x" + x);
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc08.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc08.nextInt();

        StringBuilder deret = new StringBuilder();
        int hasil = hitungPangkat(bilangan, pangkat, deret);

        System.out.println("Hasil: " + deret.toString() + " = " + hasil);
    }
}
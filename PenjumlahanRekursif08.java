public class PenjumlahanRekursif08 {
    public static void main(String[] args) {
        int f = 8;
        int hasil = penjumlahanRekursif(f);

        System.out.print("1");
        for (int i = 2; i <= f; i++) {
            System.out.print("+" + i);
        }

        System.out.println(" = " + hasil);
    }

    public static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }
}

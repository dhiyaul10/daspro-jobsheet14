public class PasanganMarmut08 {
    public static void main(String[] args) {
        int bulanKe12 = 12;
        int jumlahMarmut = hitungPasanganMarmut(bulanKe12);

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulanKe12 + ": " + jumlahMarmut);
    }

    public static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }
}

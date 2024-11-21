import java.util.Scanner;

public class Kafe26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "DISKON50");

        int totalKeseluruhan = 0;
        String pilihanLain = "ya"; 

        while (pilihanLain.equalsIgnoreCase("ya")) {
            System.out.println("Masukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.println("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            System.out.println("Masukkan kode promo (jika ada, kosongkan jika tidak ada): ");
            sc.nextLine(); 
            String kodePromo = sc.nextLine();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.println("Total harga untuk pesanan Anda saat ini: Rp" + totalHarga);
            System.out.println("Apakah Anda ingin memesan menu lain? (ya/tidak)");
            pilihanLain = sc.nextLine();
        }

        System.out.println("Total keseluruhan pesanan Anda: Rp" + totalKeseluruhan);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
       
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            totalHarga = totalHarga / 2;
        } else if (kodePromo.equals("DISKON30")) {
            totalHarga = totalHarga - (totalHarga * 30 / 100);
        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon tambahan.");
        }

        return totalHarga;
    }
}
package BookStore_Project1;

import java.util.Scanner;

public class Runner {
        public static void main(String[] args) {
            OnlineKitapMagazasi magaza = new OnlineKitapMagazasi();
            Scanner scannerStr = new Scanner(System.in);
            Scanner scannerInt = new Scanner(System.in);

            int secim;
            do {
                System.out.println("\n=========== Online Kitap Mağazası ===========");
                System.out.println("  1. Kitap Ekle\n  2. Numarasıyla Kitap Sil\n  3. Tüm Kitapları Listele\n  4. Çıkış");
                System.out.print("Seçiminizi yapın: ");
                secim = scannerInt.nextInt();

                switch (secim) {
                    case 1:
                        magaza.kitapEkle();
                        break;
                    case 2:
                        magaza.kitapSil();
                        break;
                    case 3:
                        magaza.kitapListele();
                        break;
                    case 4:
                        System.out.println("Programdan çıkılıyor...");
                        break;
                    default:
                        System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
                }
            } while (secim != 4);
        }
    }


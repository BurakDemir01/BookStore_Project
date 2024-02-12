package BookStore_Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineKitapMagazasi {
        private ArrayList<Kitap> kitapListesi = new ArrayList<>();
        private Scanner scanner = new Scanner(System.in);
        private Scanner scannerInt=new Scanner(System.in);

        public void kitapEkle() {
            System.out.print("Kitap Adı: ");
            String ad = scanner.nextLine();
            System.out.print("Yazar Adı: ");
            String yazar = scanner.nextLine();
            System.out.print("Yayın Yılı: ");
            int yayinYili = scannerInt.nextInt();
            System.out.print("Fiyat: ");
            double fiyat = scannerInt.nextDouble();

            Kitap kitap = new Kitap(ad, yazar, yayinYili, fiyat);
            kitapListesi.add(kitap);
            System.out.println("Kitap başarıyla eklendi.");
        }

        public void kitapSil() {
            System.out.print("Silmek istediğiniz kitabın ID'sini girin: ");
            int id = scannerInt.nextInt();

            boolean removed = false;
            for (Kitap kitap : kitapListesi) {
                if (kitap.getId() == id) {
                    kitapListesi.remove(kitap);
                    removed = true;
                    System.out.println("Kitap başarıyla silindi.");
                    break;
                }
            }

            if (!removed)
                System.out.println("Belirtilen numarada bir kitap bulunamadı.");
        }

        public void kitapListele() {
            if (kitapListesi.isEmpty()) {
                System.out.println("Mağazada hiç kitap bulunmamaktadır.");
            } else {
                System.out.println("===== Kitap Listesi =====");
                for (Kitap kitap : kitapListesi) {
                    System.out.println(kitap);
                }
            }
        }
    }

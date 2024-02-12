package BookStore_Project_Task;

import java.util.ArrayList;
import java.util.Scanner;

class OnlineKitapMagazasi extends Kitap {
    private ArrayList<Kitap> kitapListesi = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private Scanner scannerint=new Scanner(System.in);

    public OnlineKitapMagazasi(String kitapAdi, String yazarAdi, double fiyat, int yayinYili) {
        super(kitapAdi, yazarAdi, fiyat, yayinYili);
    }

    public OnlineKitapMagazasi() {
        super();
    }

    public  void kitapEkle() {
        // TODO: kitapEkle() methodunu doldurunuz
        // Kullanıcıdan Kitap Adı, Yazar Adı, Yayın Yılı (int) ve Fiyat (double) bilgisini alarak,
        // itapListesine ekleyen metodu yazınız.
        // NOT: Kullanıcıdan aldığınız bilgilerle bir kitap nesnesi oluşturmayı unutmayınız.
        System.out.print("Eklemek istediginiz kitabin adi=");
        String kitapadi=scanner.nextLine();
        System.out.print("Eklemek istediginiz kitabin yazari=");
        String yazaradi=scanner.nextLine();
        System.out.print("Kitabin yayin yili=");
        int yayinyili=scannerint.nextInt();
        System.out.print("Kitabin fiyati=");
        double fiyat=scannerint.nextDouble();
        Kitap  kitap1=new Kitap(kitapadi,yazaradi,fiyat,yayinyili);
        kitapListesi.add(kitap1);
        System.out.println(kitapadi+"  kitabi basariyla eklenmistir");

        for (Kitap kitap:kitapListesi){
            if (kitap==null){
                System.out.println("henüz kitap eklenmemis");
            }else{
                System.out.println("******KITAP LISTESI**********");
                System.out.println("kitap adi=" +kitap.getKitapAdi());
                System.out.println("yazar adi="+kitap.getYazarAdi());
                System.out.println("yayin yili="+kitap.getYayinYili());
                System.out.println("fiyat="+kitap.getFiyat());
                System.out.println("kitap numarasi="+kitap.getKitapID());


            }




        }}
    //////////////////////////////////////////////////
    public void kitapSil() {

        // TODO: kitapSil() methodunu doldurunuz
        // Kullanıcıdan unique (yegane) kitap numarasını alarak, kitap listesinden çıkaran metodu yazınız.
        // NOT: Silinecek kitabın listede olup olmadığını kontrol etmeyi unutmayınız.
        // İşlemin sonucunu konsola yazdırınız: "Kitap başarıyla silindi." veya "Belirtilen numarada bir kitap bulunamadı." gibi...

            System.out.print("Silmek istediğiniz kitabın ID'sini girin: ");
            int id = scannerint.nextInt();

            boolean removed = false;
            for (Kitap kitap : kitapListesi) {
                if (kitap.getKitapID() == id) {
                    kitapListesi.remove(kitap);
                    removed = true;
                    System.out.println("Kitap başarıyla silindi.");
                    break;
                }
            }

            if (!removed)
                System.out.println("Belirtilen numarada bir kitap bulunamadı.");
        }

       /* for (Kitap kitap:kitapListesi){
            if (kitap.getKitapID()==kitapID){
                System.out.println("silmek istediginiz kitap ismi"+kitap.getKitapAdi());
                kitapListesi.remove(kitap.);
                System.out.println("Kitap basariyla silindi");
            } else
                System.out.println("Aradiginiz kitap numarasina ait bir kayit bulunamamistir");
        }*/



    }
//////////////////////////////////////////////////
   /* public void kitapListele() {

        // TODO: kitapListele() methodunu doldurunuz
        // Lİstede bulunan kitapları listeleyen metodu yazınız...
        // Listede kitap yoksa konsola "Henüz kitap eklenmemiş." veya "Listede kitap yok" mesajı yazdırınız.
        for (Kitap kitap:kitapListesi){
            if (kitap.getKitapAdi()==null){
                System.out.println("henüz kitap eklenmemis");
            }else{
                System.out.println("******KITAP LISTESI**********");
                System.out.println("kitap adi=" +kitap.getKitapAdi());
                System.out.println("yazar adi="+kitap.getYazarAdi());
                System.out.println("yayin yili="+kitap.getYayinYili());
                System.out.println("fiyat="+kitap.getFiyat());
                System.out.println("kitap numarasi="+kitap.getKitapID());


            }

        }*/



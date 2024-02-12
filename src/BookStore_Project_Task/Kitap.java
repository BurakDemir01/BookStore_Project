package BookStore_Project_Task;

public class Kitap {

    //TODO: int kitapNumarasi ve yayinYili; String kitapAdi ve yazarAd; double fiyat fieldlarini olusturun.
    // Oluşan her kitap nesnesinin yegane (unique) bir kitap numarası olmalıdır.
      private String kitapAdi;
    private String yazarAdi;
    private double fiyat;
    private int yayinYili;
    private int kitapID;
    private static int sayac=1;





    ///////////////////////////////////////////////////////////////////////


        //TODO: Kitap nesnesi oluşturma sırasında ilk çalışan metodu (constructor) olusturun
        //NOT: Her kitabın tekil bir kitap numarası (id) olduğunu unutmayınız...

    public Kitap(String kitapAdi, String yazarAdi, double fiyat, int yayinYili) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.fiyat = fiyat;
        this.yayinYili = yayinYili;
        this.kitapID=sayac++;
    }

    public Kitap() {

    }


    // TODO: Gerekli olan getter() veya setter() metodlarını oluşturunuz.
    // Kullanılmayanları oluşturmanıza gerek yok.
    // Program tamamlandıktan sonra kullanılmayan metodları sonradan silmek de bir yöntemdir


    public String getKitapAdi() {
        return kitapAdi;
    }



    public String getYazarAdi() {
        return yazarAdi;
    }



    public double getFiyat() {
        return fiyat;
    }



    public int getYayinYili() {
        return yayinYili;
    }



    public int getKitapID() {
        return kitapID;
    }


    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", fiyat=" + fiyat +
                ", yayinYili=" + yayinYili +
                ", kitapID=" + kitapID +
                '}';
    }
}

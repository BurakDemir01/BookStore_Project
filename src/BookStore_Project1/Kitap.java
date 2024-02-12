package BookStore_Project1;

public class Kitap {
    private static int idCounter = 1;
    private int id;
    private String ad;
    private String yazar;
    private int yayinYili;
    private double fiyat;

    public Kitap(String ad, String yazar, int yayinYili, double fiyat) {
        this.id = idCounter++;
        this.ad = ad;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Ad: " + ad + ", Yazar: " + yazar + ", Yayın Yılı: " + yayinYili + ", Fiyat: " + fiyat;
    }
}


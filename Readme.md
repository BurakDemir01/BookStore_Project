# Kitap Listesine Ekleme-Çıkarma İşlemleri:
### Bu projemizde bizden, online kitap satışı yapan bir mağazanın ürün listesine ekleme çıkarma yapabilen bir modül tasarlanması istenmiştir. 

Projenin Örnek Ağaç Yapısı Aşağıdaki Gibi Olabilir :
```markdown
src
├───bookStore
│       Kitap.java
│       OnlineKitapMagazasi.java
│       Readme.md
│       Runner.java
```

1. Java programlama dilinde, kullanıcıya kitap eklemesi, kitap silmesi ve mevcut kitapları listelemesi için bir uygulama geliştirmeniz istenmektedir. Bu uygulama içerisinde aşağıdaki kavramları kullanmanız beklenmektedir:
--- 
- Bir `Kitap` sınıfı oluşturun. Bu sınıf, kitap adı, yazar adı, yayın yılı ve fiyat gibi özellikleri (`fields`) içermelidir. Kitap numarası (id'si) otomatik ve sıralı bir şekilde yegane (unique) olarak (`static`) atanmalıdır.
---
- Bir `OnlineKitapMagazasi` sınıfı oluşturun. Bu sınıf, kitapları bir dizi (array) içerisinde tutmalıdır. Kullanıcıdan alınan girdilere göre kitap ekleme, kitap silme ve kitapları listeleyebilme metotları içermelidir. Kitap silme fonksiyonu, silinecek kitabın listede olup olmadığını kontrol etmelidir. Silinecek kitap listede yoksa, "_**Belirtilen numarada bir kitap bulunamadı.**_" gibi bir mesajı konsolda göstermelidir. 
- Bu sınıfın aşağıdaki gibi field ve methodları olmalıdır:
```java
class OnlineKitapMagazasi {
    private ArrayList<Kitap> kitapListesi = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void kitapEkle() {...}

    public void kitapSil() {...}

    public void kitapListele() {...}
}
```
---
- Bir menü oluşturun. Menü, kullanıcıya aşağıdaki gibi seçenekleri sunmalıdır:
```
  ============ Online Kitap Mağazası ============
    1. Kitap Ekle
    2. Numarasıyla Kitap Sil
    3. Tüm Kitapları Listele
    4. Çıkış
```
- Kullanıcı bir seçenek belirlediğinde, ilgili işlemi gerçekleştirmek için uygun methodları çağırın.
- Programın sürekli çalışmasını sağlayın, yani kullanıcı çıkış seçeneğini seçene kadar program çalışmaya devam etmelidir.
- Müşteri farklı bir seçenek seçtiğinde "_Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin._" mesajı almalıdır.
2. Bu görevi yerine getiren bir Java programı yazınız.

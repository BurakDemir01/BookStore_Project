package BookStore_Project_Task;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // TODO:  main methodunu doldurunuz

        //  Kullanıcıya menü seçeneklerini göstererek bir seçim yapmasını isteyin;
        //  yapılan seçime göre ilgili menüye (OnlineKitapMagazasi sınıfında oluşturduğunuz metodlara) yönlendirin.
        //  NOT: OnlineKitapMagazasi'nın metodlarını kullanabilmek için, nesnesini oluşturmamız şart.
        //  Sadece static metodların nesne oluşturmadan kullanılabildiğini unutmayın!

        Scanner scanner = new Scanner(System.in);

        int secim=1;
        do
        {
            // Kullanıcı bir seçenek belirlediğinde, ilgili işlemi gerçekleştirmek için uygun methodları çağırın.
            // Programın sürekli çalışmasını sağlayın, yani kullanıcı çıkış seçeneğini seçene kadar program çalışmaya devam etmelidir.
            // Müşteri farklı bir seçenek seçtiğinde "Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin." mesajı almalıdır.
            System.out.println("*****Online KitapMagazasi*********");
            System.out.println("1.Kitap ekle");
            System.out.println("2.Numarasiyla Kitap sil");
            System.out.println("3.Tüm kitaplari listele");
            System.out.println("4.Cikis");
            System.out.print("Seciminizi giriniz : ");
             secim=scanner.nextInt();
             scanner.nextLine();

            OnlineKitapMagazasi islem=new OnlineKitapMagazasi();

            switch (secim){
                case 1:islem.kitapEkle();
                break;
                case 2:islem.kitapSil();
                break;
                //case 3:islem.kitapListele();
                //break;
                case 4:System.out.println("Program sonlandırılıyor.");
                break;
                default:System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.\n");

            }

        }while (secim!=4);
    }
}


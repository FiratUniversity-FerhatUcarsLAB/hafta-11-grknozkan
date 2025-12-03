public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        /*
        Program sorunsuz çalışır
        Hata vermez
        Bazı IDE’ler “Unused return value” uyarısı verebilir
        (örn: “The return value of test() is not used”)
        */
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        /*
        System.out.println("boo!") bir void metottur
        Yani bir değer döndürmez → ifade içinde kullanılamaz 

        Hata mesajı:
        error: bad operand type void for binary operator '+'

        Açıklama:
        + operatörü iki operand ister
        Ama void hiçbir değer değildir
        Bu yüzden + 7 ile birleştirilemez → tür uyumsuzluğu hatası
        */

        // Cevaplarinizi yorum olarak ekleyin.
    }
}



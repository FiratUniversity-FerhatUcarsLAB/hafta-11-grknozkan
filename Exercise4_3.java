public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

/* STACK DİYAGRAMI
1️⃣ ping() metodu ilk kez çağrıldığında stack diyagramı

İlk ping() çağrısı, program çalışırken baffle() → ping() sırasıyla gerçekleşir.

Program akışının başlangıcı:

main()
↓
zoop()
↓
baffle()
↓
ping() ← ilk kez burada

📌 Stack (Çağrı Yığını) görünümü — ilk ping() çağrısı anında
Çağrı Sırası (Üst çalışıyor)	Parametre / Yerel Değişken
ping()	(parametre yok)
baffle()	(parametre yok)
zoop()	(parametre yok)
main()	(parametre: args)

Bu sırada henüz hiçbir return olmamıştır; ping() içindeki satır çalışmaya hazırdır.
*/

/* TAM ÇIKTI
No, I wug.
You wugga wug.
I wug.
*/

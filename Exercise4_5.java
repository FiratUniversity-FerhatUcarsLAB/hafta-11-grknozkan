public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}

/*STACK DİYAGRAMI
Zoop metodu ikinci kez çağrıldığında Stack Diyagramı
İkinci çağrı şu satırda gerçekleşir:
zoop("breakfast ", fork);

Bu çağrı clink(4) içinden olur.
Çağrı yığını tam o anda şöyle görünür:
┌──────────────────────────────┐
│ zoop("breakfast ", 4)        │  ← Aktif çalışan metot
│  • fred = "breakfast "       │
│  • bob = 4                   │
├──────────────────────────────┤
│ clink(4)                     │
│  • fork = 4                  │
├──────────────────────────────┤
│ main(String[] args)          │
│  • bizz = 5                  │
│  • buzz = 2                  │
└──────────────────────────────┘
*/
/*
just for
any not more 
It’s breakfast 
!
*/

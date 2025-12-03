public class Exercise4_1 {

    public static void printAmerican(String gun, int ay, int tarih, int yil) {
        System.out.println(gun +", " + ay + " " + tarih + ", " + yil);
    }

    public static void printEuropean(String gun, int tarih, int ay, int yil) {
        System.out.println(gun + ", " + tarih + " " + ay + " " + yil);
    }

    public static void main(String[] args) {

        String gun = "Thursday";
        int ay = 11;
        int tarih = 27;
        int yil = 2025;

        System.out.println("American Format:");
        printAmerican(gun, ay, tarih, yil);

        System.out.println("European Format:");
        printEuropean(gun, tarih, ay, yil);
    }
}

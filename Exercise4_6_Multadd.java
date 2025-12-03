public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // TODO
        return a * b + c;
    }

    public static double expSum(double x) {
        // TODO
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));;
    }

    public static void main(String[] args) {
        // TODO: test methods
         System.out.println(multadd(2, 3, 4));  // 2*3+4 = 10
        System.out.println(multadd(1.5, 4.2, 0.7));

        // 4a. sin(π/4) + cos(π/4) / 2
        double result1 = multadd(Math.sin(Math.PI / 4),
                                 1,
                                 Math.cos(Math.PI / 4) / 2);
        System.out.println("Sonuç 1: " + result1);

        // 4b. log 10 + log 20
        double result2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("Sonuç 2: " + result2);

        // 5. expSum test
        double x = 2;
        System.out.println("expSum(" + x + ") = " + expSum(x));
    }
}

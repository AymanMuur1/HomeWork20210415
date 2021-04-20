public class Number1 {
    public static void main(String[] args) {
        sumAB(15,30);
        positiv(5);
        negative(-9);
        yellow("желтый");

    }

    private static void yellow(String color){
        for (int a = 0; a < 7; a++){
            System.out.println(color);
        }
    }


    private static void negative(int j) {
        boolean t = j < 0;
        System.out.println(t);
    }

    private static void positiv(int c) {
        if (c >= 0){
            System.out.println("Положительное");
        }else{
            System.out.println("Отрицательное");
        }
    }


    private static void sumAB(int a, int b) {
        boolean i = (a + b) >= 10 && (a + b) <= 20;
        System.out.println(i);
    }
}

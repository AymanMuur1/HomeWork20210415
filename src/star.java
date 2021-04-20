public class star {
    public static void main(String[] args) {
        leapYear(64);
    }

    private static void leapYear(int a) {
        int b = a % 4;
        int c = a % 400;
        int d = a % 100;
       boolean y = (b == 0 && d != 0) || c == 0;
       System.out.println(y);
        }

    }
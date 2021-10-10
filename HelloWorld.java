public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int count = 0;
        Boolean[] array = { a, b, c, d };
        for (int i = 0; i < 4; i++)
            if (array[i])
                count++;
        if (count == 2)
            return true;
        else
            return false;
    }

    public static int leapYearCount(int year) {
        int years = year / 4 - year / 100 + year / 400;
        return years;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        boolean result = Math.abs((a + b) - c) < 0.0001;
        return result;
    }

}

// jar cfe.hw.jar HelloWorld HelloWorld.class для сборки класса

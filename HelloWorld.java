public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
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

    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }

    public static char charExpression(int a) {
        char value = '\\';
        value += a;
        value = (char) value;
        return value;
    }

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        String bin_str = Integer.toBinaryString(value);
        long k = 0;
        for (int i = 0; i < bin_str.length(); i++)
            if (bin_str.charAt(i) == '1')
                k++;
        if (k == 1)
            return true;
        else
            return false;
    }

    public static boolean isPalindrome(String text) {
        String newString = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb_newString = new StringBuilder(newString);
        boolean fin = newString.equalsIgnoreCase(sb_newString.reverse().toString());
        return fin;
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}

// jar cfe.hw.jar HelloWorld HelloWorld.class для сборки класса

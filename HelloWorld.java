public class HelloWorld {

    public static void main(String[] args) {
        String[] roles = { "Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич" };
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!" };
        System.out.println(printTextPerRole(roles, textLines));
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

    // public static BigInteger factorial(int value) {
    // BigInteger result = BigInteger.ONE;
    // for (int i = 1; i <= value; i++)
    // result = result.multiply(BigInteger.valueOf(i));
    // return result;
    // }

    public static int[] mergeArrays(int[] arr_1, int[] arr_2) {

        int len_1 = arr_1.length, len_2 = arr_2.length;
        int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (arr_1[a] > arr_2[b])
                    result[i] = arr_2[b++];
                else
                    result[i] = arr_1[a++];
            } else if (b < len_2) {
                result[i] = arr_2[b++];
            } else {
                result[i] = arr_1[a++];
            }
        }
        return result; // your implementation here
    }

    private String printTextPerRole(String[] roles, String[] textLines) {
        int ind, k;
        String bufrole = new String();
        String buftext = new String();
        String result = new String();
        int l, j, i = 0;
        StringBuffer sbuf = new StringBuffer();
        StringBuffer text = new StringBuffer();
        for (l = 0; l < roles.length; l++) {
            for (k = 0; k < textLines.length; k++) {
                ind = textLines[k].indexOf(":");
                bufrole = textLines[k].substring(0, ind);
                buftext = textLines[k].substring(ind + 1);
                if (bufrole.equals(roles[l])) {
                    text.append((k + 1) + ")" + buftext + '\n');
                }
            }
            sbuf.append('\n' + roles[l] + ":" + '\n' + text);
            text.delete(0, text.length());
        }
        return sbuf.toString();
    }

}

// jar cfe.hw.jar HelloWorld HelloWorld.class для сборки класса

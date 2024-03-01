public class MaxNumber {

    public static int maxNumber(int num1, int num2) {
        if (num1 < 0) {
            num1 = num1 * -1;
        }
        String numStr = Integer.toString(num1);
        for (int i = 0; i < numStr.length(); i++) {
            if (Character.getNumericValue(numStr.charAt(i)) < num2) {
                return Integer.parseInt(numStr.substring(0, i) + num2 + numStr.substring(i));
            }
        }
        return Integer.parseInt(numStr + num2);
    }

}

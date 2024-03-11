package partices;

public class FindTheConsicutiveNumbers {

        public static void main(String[] args) {
            String str = "101213";

            boolean isConsecutive = isConsecutiveNumber(str);

            if (isConsecutive) {
                System.out.println(str + " represents consecutive numbers.");
            } else {
                System.out.println(str + " does not represent consecutive numbers.");
            }
        }

        public static boolean isConsecutiveNumber(String str) {
            int length = str.length();

            if (length <= 1) {
                // A single digit number is always considered consecutive
                return true;
            }

            for (int i = 0; i < length - 1; i++) {
                int digit1 = Character.getNumericValue(str.charAt(i));
                int digit2 = Character.getNumericValue(str.charAt(i + 1));
                if (digit2 != digit1 + 1) {
                    return false;
                }
            }

            return true;
        }
    }



import java.util.* ;
public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String Alphabet = "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = (int) (Alphabet.length() * Math.random());
            sb.append(Alphabet.charAt(index));
        }
        return sb.toString();
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */

    public String strongPassword(int length) throws Exception{
        String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
        String NUMBERS = "1234567890";
        String SPECIAL_CHARACTERS = "!@#$%^&*_=+-/";
        String password = "";
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        Random random = new Random();
        for(int i = 0; i < length; i++){
            int type = random.nextInt(4);
            switch (type) {
                //افزودن حروف بزرگ
                case 0:
                    password += CAPITAL_LETTERS.charAt(random.nextInt(CAPITAL_LETTERS.length()));
                    break;
                //افزودن حروف کوچک
                case 1:
                    password += LOWERCASE_LETTERS.charAt(random.nextInt(LOWERCASE_LETTERS.length()));
                    break;
                //افزودن عدد
                case 2:
                    password += NUMBERS.charAt(random.nextInt(NUMBERS.length()));
                    hasDigit = true;
                    break;
                // افزودن کاراکتر خاص
                case 3:
                    password += SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length()));
                    hasSpecialChar = true;
                    break;
            }
        }
        // اگه پسوورد حداقل یک رقم و یک کاراکتر خاص رو نداشت:
        if (!hasDigit || !hasSpecialChar) {
            return strongPassword(length);
        }
        return password;
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */

    public static boolean isFiboBin(int n) {
        for (int i = 0; i < 100; i++) {
            if (n == Lecture4Exercises.fibonacci(i) + Integer.parseInt(Integer.toBinaryString(Lecture4Exercises.fibonacci(i)))) {
                return true;
            }
        }
        return false;
    }
}

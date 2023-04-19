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
    public String strongPassword(int length) throws Exception {

        return null;
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

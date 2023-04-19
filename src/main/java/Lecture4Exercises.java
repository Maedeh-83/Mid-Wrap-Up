import java.util.* ;
public class Lecture4Exercises {
    Scanner input = new Scanner(System.in);

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        int sum = 1;
        for (int i = 1; i<=n; i++){
            sum = sum * i;
        }
        return sum;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public static int fibonacci(int n) {
        if(n==1 || n==2){
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */

    public String reverse(String word){
        String result = "" ;
        for (int i=0; i<word.length(); i++) {
            char ch= word.charAt(i);
            result= ch + result;
        }
        return result;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        int n = line.length();
        char[] array = new char[n];
        array = line.toCharArray();
        if(n%2 == 0) { return false; }
        if(n%2 == 1) {
            for(int i=0; i<(n/2); i++){
                if(array[i] == array[n-1-i]) { return true; }
                else { return false; }
            }
        }
        return false;
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        return null;
    }
}

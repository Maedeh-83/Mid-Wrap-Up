import java.util.ArrayList;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public int calculateEvenSum(int[] arr) {
        int sum = 0;
        for(int i=0; i< arr.length ; i=i+2) {
            sum = sum + (int) arr[i] ;
        }
        return sum ;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            int j = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = j;
        }
        return arr;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException{
        int row1 = m1.length;
        int col1 = m1[0].length;
        int col2 = m2[0].length;
        double[][] result = new double[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public ArrayList<ArrayList<String>> arrayToList(String[][] inputArray) {
        ArrayList<ArrayList<String>> outputList = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            ArrayList<String> innerList = new ArrayList<>();
            for (int j = 0; j < inputArray[i].length; j++) {
                innerList.add(inputArray[i][j]);
            }
            outputList.add(innerList);
        }
        return outputList;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            primeFactors.add(n);
        }
        return primeFactors;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> words = new ArrayList<>();
        String[] splitWords = line.split("\\s+");
        for (String word : splitWords) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
        return words;
    }
}

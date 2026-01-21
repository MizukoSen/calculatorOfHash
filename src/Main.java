import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        long totalSum = 0;
        int wIndex = 0;

        System.out.println("Put the word here ↓");
        String word = scn.nextLine();

        System.out.println("You putted: " + word);

        char[] wLength = word.toCharArray();

        System.out.println("Length of word = " + wLength.length);
        System.out.println(" Char | hex | weight | sum weight ");

        //I know that can make it much easier, but I just want to try to work with for-each in this form :D
        for(char w : wLength){
            // ↓ hash0 + hash1 * 31 + hash2 + 31²... hash(s)= n-1↑∑↓i=0 s[i] * p^i
            long sum = w * (long)Math.pow(31, wIndex);
            totalSum += sum;
            System.out.println(w + " | " + wIndex + " | " + w + " | " + sum + " | " + totalSum);
            wIndex += 1;
        }
        System.out.println("Final weight of word: " + totalSum);
    }
}
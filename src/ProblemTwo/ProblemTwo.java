package ProblemTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Swapnil on 3/30/2016.
 */
public class ProblemTwo {

       public static void main(String[] args) throws IOException {

           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           int counter = Integer.parseInt(reader.readLine());

           while (counter-->0) {
               String[] inputs = reader.readLine().split(" ");
               int m = Integer.parseInt(inputs[0]);
               int n = Integer.parseInt(inputs[1]);

               for (int i = m; i <= n; i++) {
                   if (isPrime(i)) {
                       System.out.println(i);
                   }
               }

               System.out.println();
           }
       }

    private static boolean isPrime(int number) {
        if (number <= 1)
            return  false;
        else {
            if (number == 2 || number == 3 || number == 5 || number == 7 )
                return true;
            else {
                for (int i = 2; i < Math.sqrt(number); i++) {
                    if (number % i == 0)
                        return false;
                }
                return true;
            }
        }
    }
}
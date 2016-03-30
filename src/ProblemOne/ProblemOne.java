package ProblemOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Swapnil on 3/30/2016.
 */
public class ProblemOne {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while(!(input = reader.readLine()).equals("42")){
        System.out.println(input);
    }
  }
}

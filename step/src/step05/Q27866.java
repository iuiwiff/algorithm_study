package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int num = Integer.parseInt(br.readLine());

        System.out.println(word.charAt(num-1));
    }//main
}//class

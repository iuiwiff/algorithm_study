package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        //모두 같은 눈
        if(a == b && b == c) {
            System.out.println(10000 + (a * 1000));
        }

        //같은 눈이 2개
        if(a == b && a != c) {
            System.out.println(1000 + (a * 100));
        } else if (b == c && a != b) {
            System.out.println(1000 + (b * 100));
        } else if (a == c && a != b) {
            System.out.println(1000 + (c * 100));
        }

        //모두 다른 눈
        if(a > b && a > c && b !=c) {
            System.out.println(a * 100);
        } else if (b > a && b > c && a != c) {
            System.out.println(b * 100);
        } else if (c > a && c > b && a != b){
            System.out.println(c * 100);
        }//end if

    }//main
}//class

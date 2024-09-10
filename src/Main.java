import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arr= new int[10001];

        int num = Integer.parseInt(bf.readLine());

        for(int i = 0; i < num; i++) {
            arr[Integer.parseInt(bf.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10001; i++) {
            while(arr[i] > 0) {
                sb.append(i).append("\n");
                arr[i]--;
            }
        }

        System.out.print(sb);
    }
}
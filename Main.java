import java.io.*;
import java.util.*;

public class Main {
     static int[] arr;
     static int[] cnt;
     static int[] result;
     public static void main(String[] args) throws IOException {
          arr = new int[100];

          Random random = new Random();

          for(int i=0;i<100;i++){
               arr[i] = random.nextInt(31);
          }

          cnt = new int[31];

          for(int i=0;i<arr.length;i++){
               cnt[arr[i]] += 1;
          }

          for(int i=1;i<cnt.length;i++){
               cnt[i] += cnt[i - 1];
          }

          result = new int[arr.length];

          for(int i=arr.length-1;i>=0;i--){
               int val = arr[i];

               cnt[val] -= 1;
               result[cnt[val]] = val;
          }

          StringBuilder sb = new StringBuilder();

          for(int i=0;i<100;i++){
               sb.append(Integer.toString(arr[i]) + " ");
          }

          System.out.println(sb);
          System.out.println("");

          sb = new StringBuilder();

          for(int i=0;i<100;i++){
               sb.append(Integer.toString(result[i]) + " ");
          }

          System.out.println(sb);
     }
}
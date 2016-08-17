/**
 * Created by schaud3 on 8/13/16.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Aug13_2016_1 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("/Users/schaud3/Documents/personal/HackerRank/src/input"));
        int n = in.nextInt();
        int sum=0,temp,temp1,count=0;
        List<Integer> a = new ArrayList();
        for(int a_i=0; a_i < n; a_i++){
            temp = in.nextInt();
            sum += temp;
            a.add(temp);
        }
        for(int i=0 ; i<a.size();i++){
            if(sum-a.get(i)<= a.get(i)){
                count++;
                temp = 3*a.get(i)-sum-1;
                temp1=a.get(i)-temp;
                a.remove(i);
                a.add(i,temp);
                a.add(temp1);
            }
        }
        System.out.println(count);
    }
}

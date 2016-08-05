/**
 * Created by schaud3 on 8/5/16.
 * https://www.hackerrank.com/challenges/bigger-is-greater
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        int n;
        Scanner in = new Scanner(new File("/Users/schaud3/Documents/workspace/HackerEarth/src/input"));
        n = in.nextInt();
        in.nextLine();
        while(n>0){
            String str = in.nextLine();
            char[] strInp = str.toCharArray();
            int swapIndex=-1;
            int dipIndex=-1;
            for(int i=strInp.length -1 ; i>0;i--){
                if(strInp[i]>strInp[i-1]){
                    dipIndex = i-1;
                    swapIndex = i;
                    for(int j=dipIndex+1 ; j<strInp.length;j++){
                        if(strInp[swapIndex]>strInp[j] && strInp[j]>strInp[dipIndex]){
                            swapIndex = j;
                        }
                    }
                    char temp = strInp[swapIndex];
                    strInp[swapIndex]=strInp[dipIndex];
                    strInp[dipIndex]=temp;
                    Arrays.sort(strInp,dipIndex+1,strInp.length);
                    break;
                }
            }
            if(swapIndex == -1){
                System.out.println("no answer");
            }else{
                System.out.println(strInp);
            }
            n--;
        }
    }
}

/*
Question: Given a word , rearrange the letters of  to construct another word  in such a way that  is lexicographically greater than . In case of multiple possible answers, find the lexicographically smallest one among them.

Input Format

The first line of input contains , the number of test cases. Each of the next  lines contains .

Constraints

 will contain only lower-case English letters and its length will not exceed .
Output Format

For each testcase, output a string lexicographically bigger than  in a separate line. In case of multiple possible answers, print the lexicographically smallest one, and if no answer exists, print no answer.
 */
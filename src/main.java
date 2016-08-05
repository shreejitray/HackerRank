import java.io.File;
import java.util.Scanner;

/**
 * Created by schaud3 on 4/29/16.
 */
public class main {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(new File("/Users/schaud3/Documents/workspace/HackerEarth/src/input"));
        int t = in.nextInt();
        while(t-- >0){
            int n,mIndex,rIndex,mcount=0,rcount=0;
            long mlength,rlength;

            n=in.nextInt();
            long[] pencil = new long[n];
            mIndex=0;
            rIndex=n-1;
            for(int i=0;i<n;i++){
                pencil[i] = in.nextInt();
            }
            mlength = pencil[mIndex];
            rlength = pencil[rIndex];
            while(mIndex < rIndex){
                if(2*rlength > mlength){
                    mIndex++;
                    mcount++;
                    //over = mlength%2;
                    rlength -= (mlength+1)/2;
                    mlength = pencil[mIndex];

                }
                else{
                    if(2*rlength==mlength){
                        mIndex++;
                        mcount++;
                        rIndex--;
                        rcount++;
                        rlength = pencil[rIndex];
                        mlength = pencil[mIndex];
                        if(rIndex == mIndex){
                            rlength = pencil[mIndex]*2;
                        }
                    }else{
                        rIndex--;
                        rcount++;
                        mlength -= 2*rlength;
                        rlength = pencil[rIndex];
                    }
                }
            }
            if(mIndex == rIndex){
                if(pencil[rIndex]==rlength){
                    mcount++;
                }else{
                    rcount++;
                }
            }
            System.out.println(mcount+" "+rcount);
        }
    }
}

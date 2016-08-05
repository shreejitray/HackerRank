import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by schaud3 on 8/5/16.
 */
public class ScannerInput {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("/Users/schaud3/Documents/personal/HackerRank/src/input"));
        System.out.println(in.nextInt());
        System.out.println(in.next());
        System.out.println(in.nextInt());
    }

}
// nextLine returns the input that was skipped.
// in this case newline character I assume. Alaways a safe bet would be to use the next() method.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Cagy on 9/1/2017.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Add.Plus(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));
        System.out.println("Hello new Branch!");
    }
}

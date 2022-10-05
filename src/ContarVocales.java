import java.io.FileReader;
import java.io.IOException;

public class ContarVocales {
    private  static  String FILE_NAME = "input.txt";

    public static void main(String[] args) throws IOException {
        /*FileReader input = new FileReader("C:\\Users\\Nicola\\Desktop\\Nicola.txt");
        int c;

        c = input.read();
        System.out.println((char) c);*/

        try {
            CharCounter contador = new CharCounter();
            FileReader input = new FileReader("C:\\Users\\Nicola\\Desktop\\input.txt");
            int c = input.read();
        } catch (IOException e) {

        }

    }
}
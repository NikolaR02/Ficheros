import java.io.*;

public class InvertirAE {
    private static String ENTRADA = "entrada.txt";
    private static String SALIDA = "salida.txt";

    public static void main(String[] args) throws IOException {
        String linea;
        boolean control;

        BufferedReader entrada = new BufferedReader( new FileReader("C:\\Users\\Nicola\\Desktop\\entrada.txt"));
        BufferedWriter salida = new BufferedWriter( new FileWriter("C:\\Users\\Nicola\\Desktop\\salida.txt"));

        linea = entrada.readLine();
        while (linea != null) {
            control = false;
            for (int i = 0; i < linea.length() && control != true; i++) {
                if (linea.charAt(i) == 'a' || linea.charAt(i) == 'e') {
                    control = true;
                }

            }
            if (control == true) {
                salida.write(InvertirAE.invertir(linea));
            } else {
                salida.write(linea);
            }
            linea = entrada.readLine();
        }
        entrada.close();
        salida.close();

    }

    private static String invertir(String s) {
        String invertida="";

        for (int i = s.length()-1; i >= 0 ; i--) {
            invertida += s.charAt(i);
        }
        return invertida;
    }
}

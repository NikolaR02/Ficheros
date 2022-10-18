/*El algoritmo César es un método de sustitución que consiste en cambiar cada carácter por otro
carácter que se encuentra 3 posiciones después en el alfabeto.

Debe funcionar tanto con mayúsculas como con minúsculas e ignorar (copiar tal cual) todos
aquellos caracteres que no sean letras (dígitos, signos de puntuación, espacios, etc).*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Cesar {
    public static void main(String[] args) {
        File mensaje = new File(".\\src\\datos\\" + args[0]);
        File cifrado = new File(".\\src\\datos\\" + mensaje.getName() + ".cifrado.txt");

        String[] mayusculas = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        try {
            FileReader fr = new FileReader(mensaje);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (String s : mayusculas) {
            if ("E"==s) {

            } else {

            }
        }
    }
}

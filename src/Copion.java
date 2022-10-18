/*Segundo: Copion (no se entrega)
        Crea una clase Java en un fichero llamado Copion.java con un método main() que copiará el
        contenido de un fichero de texto existente en un nuevo fichero. La copia será un fichero exactamente
        igual o un fichero con el mismo contenido que el original, pero en orden inverso, es decir, del último
        carácter al primero.

        El programa recibirá 3 argumentos de la línea de comandos que serán el fichero de entrada, el
        fichero de salida y una palabra ('igual' o 'inverso') que indica si se quiere la copia igual o al revés del
        original.

        Nota: Los nombres de ficheros que recibe el programa no se escribirán con ruta. El programa
        siempre los buscará o los guardará en la ruta ./src/datos/ Cuando ejecutamos un programa desde el
        propio entorno Eclipse se toma como carpeta actual la carpeta raíz del proyecto.
        MUY IMPORTANTE: Para hacer la copia inversa usaremos, como paso intermedio, un objeto
        CharArrayWriter. Aunque se puede hacer sin este objeto, es un requisito obligatorio en este ejercicio,
        puesto que estamos practicando los flujos.

        A tener en cuenta que el programa:
        - debe comprobar que se reciben exactamente 3 argumentos.
        - debe comprobar que el fichero de entrada existe.
        - debe comprobar que el fichero de salida NO existe.
        - debe comprobar que el tercer parámetro es una de las palabras: 'igual' o 'inverso', aunque debe
        funcionar con cualquier combinación de mayúsculas/minúsculas en esta palabra.

        Si el usuario no ha efectuado la llamada correctamente, se le informa cuál de esas cuatro
        condiciones ha fallado y no se realiza ninguna otra tarea.
*/



import java.io.*;

public class Copion {

    public static void main(String[] args) throws IOException {
        String linea;

        BufferedReader entrada = new BufferedReader( new FileReader(args[0]));
        BufferedWriter salida = new BufferedWriter( new FileWriter(args[1]));

        linea = entrada.readLine();
        while (linea != null) { // 1 dentro de cada if aunque queda mas codigo

            if (args[3] == "invertido") {
                salida.write(Copion.invertir(linea));
            } else if (args[3] == "igual") {
                salida.write(linea);
            } else {}
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

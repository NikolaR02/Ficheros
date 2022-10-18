import java.io.*;
/*Tercero: Comparador (no se entrega)

Crea una clase Java en un fichero llamado Comparador.java con un método main() que compara
dos ficheros de texto existentes. El programa recibe el nombre de los ficheros como argumentos de la
línea de comandos. Como en el ejercicio anterior, los nombres de ficheros se escriben sin ruta y se alojan
en ./src/datos/

Si, finalmente, los dos ficheros son iguales devolverá el mensaje "Los ficheros son iguales". Si no
lo son, devolverá lo siguiente:

Los ficheros no son iguales.
Línea x, fichero file1:
contenido de la línea x del fichero file1
Línea x, fichero file2:
contenido de la línea x del fichero file2

Nota: Este programa debe funcionar tanto en Linux y Windows.
MUY IMPORTANTE: Para la lectura de los ficheros de este ejercicio usaremos obligatoriamente un
objeto LineNumberReader.

A tener en cuenta que el programa:
➢ debe comprobar que se reciben exactamente 2 argumentos.
➢ debe comprobar que ambos ficheros existen.

Si el usuario no ha efectuado la llamada correctamente, se le informa cuál de esas condiciones ha
fallado y no se realiza ninguna otra tarea.

*/

public class Comparador {

    public static void main(String[] args) throws IOException {
        String linea;
        BufferedReader entrada;
        BufferedWriter salida;

        if (args.length != 2) {
            System.err.println("Tienes que pasar 2 argumentos que tienen que ser ficheros");
        } else {

            try {
                System.out.println(".\\src\\datos\\" + args[0]);
                File f1 = new File(".\\src\\datos\\", args[0]);
                FileReader fr1 = new FileReader(f1);
                BufferedReader br1 = new BufferedReader(fr1);
                LineNumberReader lnr1 = new LineNumberReader(br1);

                //entrada = new BufferedReader(new FileReader(, );
                //salida = new BufferedWriter(new FileWriter(".\\src\\datos\\", args[1]));


            /*
            linea = entrada.readLine();
            while (linea != null) { // 1 dentro de cada if aunque queda mas codigo

                if (args[3] == "invertido") {
                    salida.write(Comparador.invertir(linea));
                } else if (args[3] == "igual") {
                    salida.write(linea);
                } else {
                }
                linea = entrada.readLine();
            }
            entrada.close();
            salida.close();*/
            } catch (FileNotFoundException e) {
                System.err.println("No se ha encontrado el fichero");
            }
        }
    }

    private static String invertir(String s) {
        String invertida="";

        for (int i = s.length()-1; i >= 0 ; i--) {
            invertida += s.charAt(i);
        }
        return invertida;
    }
}

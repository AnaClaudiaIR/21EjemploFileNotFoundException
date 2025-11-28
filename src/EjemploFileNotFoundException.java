import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploFileNotFoundException {
    public static void main(String[] args) {

        //Archivo que se va a intentar abrir
        String nombreArchivo = "Hola.txt";
        try {
            //Crear objeto File --> Ubicación del archivo
            File archivo = new File(nombreArchivo);

            //Se comunica con el SO --> Intenta establecer conexión con el archivo
            Scanner lector = new Scanner(archivo);
            System.out.println("Se ha encontrado el archivo.");

            //Imprimir la primera frase del documento
            if (lector.hasNextLine()) {
                System.out.println("Contenido de la primera línea: " + lector.nextLine());
            }
            lector.close(); //Cerrar el scanner
        } catch (FileNotFoundException e) {
            System.err.println("El archivo '" + nombreArchivo + "' no fue encontrado.");
            System.err.println("Detalles del error: " + e.getMessage());
        }
    }
}
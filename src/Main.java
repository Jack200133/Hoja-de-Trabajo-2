/***************************************************************
 * Main.java
 * Autor: Juan Angel Carrera
 * Universidad del Valle de Guatemala
 *
 * Main class que sirve para leer el documento con los datos y enviarselos
 * a la calculadora y mostrar los resultados
 ***************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try { // busca el archivo y lo scanea para hacer las operaciones
            File datos = new File("datos.txt");
            Scanner scan = new Scanner(datos);
            CalculadoraJAC cj = new CalculadoraJAC();

            while (scan.hasNextLine()) {
                String dt = scan.nextLine();
                String resultado = cj.Calculo(dt);
                System.out.println(resultado);
            }
            scan.close();
        }
        catch (FileNotFoundException e){
            System.out.println("No hay docuemnto");
            e.printStackTrace();
        }

    }
}

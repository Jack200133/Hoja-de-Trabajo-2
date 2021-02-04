import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
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

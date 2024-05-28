
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input;
        int num;
            // System.out.println("ingese el numero de de la serie numerica");
            //  int num = sc.nextInt();

             while (true) {
                System.out.println("Ingrese el número de la serie numérica (o 'exit' para salir):");
                input = sc.nextLine();
    
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
    
                try {
                    num = Integer.parseInt(input);
                    // Aquí puedes procesar el número como desees
                    System.out.println("Número ingresado: " + num);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                }
            }
        // //declara variable bf
        // BucleFor buclefor;
        // //insranciar "new"
        // buclefor = new BucleFor();
        // buclefor.SignosAlternos();
    }
}

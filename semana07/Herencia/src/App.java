import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        Padre p = new Padre("Jairo");
        Hijo h = new Hijo("Andresss");
        p.saludar();
        h.saludar();
        
    }
}

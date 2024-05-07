
# CLASE 06/05/2024
- Estructurado: Variables, uso de estructuras, punteros, funciones
- O.O: atributos, metodos, clases
- Ctrl + k + c = comentar
-Ctrl + K + u = quitar comentarios


```java
public class bucles{
    int casa;             //Atributos/propiedades
    int piso;
    public static void main(String[] args) {
        int num;;         //Variables
        String nombre;
    }
}

- bucle sin llaves
public class bucles{
    public static void main(String[] args) {
        
        for(int i=0; i<10; i++)
        System.out.println(i);
    }
}

```java
        for(int i=0; i<10; i++)
        if(i==5)
        System.out.println("numero 5");
        else
        System.out.println(i);

for(int i=0; true; i++) {
    }

- otra forma del if
int n = 5;
        System.out.println((n == 5) ? "el numero es cinco" : "no es cinco");

       
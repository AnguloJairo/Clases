public class Hijo extends Padre {
    private String nombre;

    // public Hijo() {
    //     super("padre");

    // }

    public Hijo(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy hijo de "+nombre);
    }


}

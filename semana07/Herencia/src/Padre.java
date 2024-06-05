public class Padre {
    protected String nombre;

    public Padre(){
        setNombre("soy tu papi");
    }

    public Padre(String nombre) {
        setNombre(nombre);
    }

    public void saludar(){
        System.out.println("buen dia, soy "+this.nombre); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = "";
        if(nombre != null)
            this.nombre = nombre.toUpperCase();
    }

}

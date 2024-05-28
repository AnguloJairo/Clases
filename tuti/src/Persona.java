public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;

    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
    }
    
    public Persona(String nombre, String apellido, String cedula) {
        // setNombre(nombre);
        // setApellido(apellido);
        // setCedula(cedula);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre.toUpperCase(); 
        else
            this.nombre = "no valido";
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        if(apellido != null)
            this.apellido =apellido.toUpperCase(); 
        else
            this.apellido = "no valido";
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if(cedula != null && cedula.length()==10)
            this.cedula =cedula; 
        else
            this.cedula = "no valido";
    }


}

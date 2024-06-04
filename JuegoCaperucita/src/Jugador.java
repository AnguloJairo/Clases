public class Jugador {
    private String usuario;
    private String clave;
    private String nombre;

    public Jugador() {
        setClave("1234");
        setNombre("Jairo");
        setUsuario("AngJai");
    }

    public boolean login(){
        String nombre="";
        String usuario="";
        boolean registro=true;
        do{
            
        System.out.println("ingresa el usuario");
        usuario = App.sc.nextLine();
        System.out.println("ingresa el nombre");
        nombre = App.sc.nextLine();
        
        if(this.usuario.equalsIgnoreCase(usuario) == this.clave.equalsIgnoreCase(clave))
            return true;

            System.out.println("presiona s para salir");
            if(App.sc.nextLine().toUpperCase().equals("S"))
                return false;

        }while(registro);
        return false;

    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre.toUpperCase();
        else
            this.nombre = "";
    }

    
}

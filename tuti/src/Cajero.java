public class Cajero {
    private String user;
    private String clave;
    
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean cobrar(){
        return true;
    }


}

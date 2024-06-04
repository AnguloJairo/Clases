public class Juego {
    public Jugador usuario;
    private String[] ladoIzq;
    private String[] ladoDer;
    private String barca;
    private String rio;
    private Boolean vikingoEstaIzq;
    public Juego(){
        this.usuario = new Jugador();
        this.vikingoEstaIzq = true;
        this.ladoIzq = new String[] {"V", "C", "L", "U"};
        this.ladoDer = new String[] {"", "", "", ""};
        this.barca = "\\_V_,_?_/";
        this.rio = "~".repeat(15);
    }

    public boolean jugarLobito(){
        while(mostrarMenu());
        return true;

    }

    public boolean mostrarMenu(){
        int opc=-1;
        System.out.println("       "+barca+rio);
        System.out.println("0. Vikingo va solo");
        System.out.println("1. Lobo");
        System.out.println("2. Caperrucita");
        System.out.println("3. Uva");
        System.out.println("4. Salir");
        
        
        do{
            try{  
                opc=-1; 
                System.out.println("Ingresa una opcion");
                opc=App.sc.nextInt();
                if(opc==4)
                    System.exit(0);
            }catch(Exception e){
                App.sc.next();
            }
        }while(opc<0 || opc>=4);
        String individuo ="";
            individuo = (vikingoEstaIzq)? ladoIzq [opc]:ladoDer [opc];
        moverBarca(individuo);
        vikingoEstaIzq = !vikingoEstaIzq;
        return true;

    }

    public void moverBarca(String individuo){
        if(vikingoEstaIzq){
            for(int i=0; i<rio.length(); i++)
                getRioBarca(i, individuo);
        }else{
            for(int i=rio.length(); i>0; i--)
                getRioBarca(i, individuo);
        }
    }
    public void getRioBarca(int posicion, String individuo){
        String rioBarca="\r"+"~".repeat(posicion) + barca.replace("?", individuo) +"~".repeat(rio.length()-posicion) ;
                System.out.print(rioBarca);
                try {
                    Thread.sleep(100);
              
                } catch (InterruptedException e) {}

    }
}

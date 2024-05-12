public class gradas {
    public void escaleras(){
        int nivel=10, espacios=1;
        for(int i=0; i<nivel;i++){
            System.out.println("|__");
            
            for(int j=0;j<espacios;j++)
            System.out.print("   ");
            espacios++;
        }
        System.out.println();
    }
}

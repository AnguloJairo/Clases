public class App {
    public static void main(String[] args) throws Exception {

        // if(args.length == 0) {
        //     System.out.println("detecto que eres un intruso");
        //     System.exit(0);
        // }

        // String usuario=args[0];
        // if(usuario.equals("angul"))
        //     System.out.println("hola papi");

        Persona pr;
        pr = new Persona();
        Persona pr2 = new Persona(null, null, "123456789");

        pr.setNombre("Jairo");
        pr.setApellido("Yandun");
        pr.setCedula("1324657890");

        System.out.println(pr.getNombre());
        System.out.println(pr.getApellido());
        System.out.println(pr.getCedula());
        System.out.println();
        System.out.println(pr2.getNombre());
        System.out.println(pr2.getApellido());
        System.out.println(pr2.getCedula());
        System.out.println(pr2.getCedula());
        


        // Cajero ocj = new Cajero();
        // Supervisor osp = new Supervisor();
        
    }
}

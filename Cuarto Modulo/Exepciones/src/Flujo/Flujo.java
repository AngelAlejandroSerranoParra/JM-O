package Flujo;



public class Flujo {

	public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin de main");
    }

    private static void metodo1() {
        System.out.println("Inicio de metodo1");
        try {
            metodo2();
        } catch(Miexepcion me){
            me.printStackTrace();
            

        }
        
        System.out.println("Fin de Metodo 1");
        
    }

    private static void metodo2() {
        System.out.println("Inicio de metodo2");
        throw new Miexepcion("Mi exepcion fue lanzada");

    }

	
}
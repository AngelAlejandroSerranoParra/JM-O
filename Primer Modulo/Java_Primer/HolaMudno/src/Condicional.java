public class Condicional {
     public static void main(String[] args) {

        System.out.println("Hello World");

        int edad = 28;
        int cantidadPersonas =2 ;
        boolean esPareja;

        if (cantidadPersonas>1){
            esPareja = true;

        } else{
            esPareja=false;

        }
        


       

        System.out.println("El valor de condicion es:"+ esPareja);

        if (edad>=18 || esPareja==true){
                        System.out.println("Usted puede entrar");

        }

        else{
            System.out.println("Usted no puede entrar ");    
        }

        
        
        //Axejandro//
    }
}

// Sirve para el entorno en general//
package Cuenta;

public class Prueba2 {
    public static void main(String[] args){
        Clienta diego=new Clienta();
            diego.titular="Diego";
            diego.documento="54545454";
            diego.telefono="84245484";

            Cuenta cuentaDiego=new Cuenta();
            cuentaDiego.agencia=1;
            cuentaDiego.titular=diego;
            // El primer titural es quien ingresa a el titual y sus objetos , el segundo argumento saca lo que necesitas
            System.out.println(cuentaDiego.titular.documento);




    }
}

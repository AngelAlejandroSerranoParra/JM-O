package Cuenta;

public class Prueba3 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego=new Cuenta();

        Clienta clienta= new Clienta();
        cuentaDeDiego.titular=clienta;
        

        cuentaDeDiego.titular=new Clienta();
        cuentaDeDiego.titular.titular="Diego";

        System.out.println(cuentaDeDiego.titular.titular);
    }
}

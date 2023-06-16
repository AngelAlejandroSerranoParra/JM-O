
package Cuenta;


public class CrearCuenta{
    public static void main(String[] args){
        Cuenta PrimeraCuenta=new Cuenta();
        PrimeraCuenta.saldo=1000;
        System.out.println(PrimeraCuenta.saldo);

        Cuenta SegundaCuenta = new Cuenta();
        SegundaCuenta.saldo=500;

        System.out.println(SegundaCuenta.saldo);
        System.out.println(PrimeraCuenta.saldo);


        
    }
}